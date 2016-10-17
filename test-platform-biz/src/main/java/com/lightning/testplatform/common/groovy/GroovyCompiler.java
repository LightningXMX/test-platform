package com.lightning.testplatform.common.groovy;

import com.google.common.collect.Maps;
import com.lightning.testplatform.common.error.TestPlatformErrorCode;
import com.lightning.testplatform.common.error.TestPlatformException;
import com.lightning.testplatform.common.util.MD5Util;
import com.lightning.testplatform.domain.ScriptDO;
import groovy.lang.GroovyClassLoader;
import groovy.lang.Script;
import org.apache.commons.lang.StringUtils;
import org.apache.log4j.Logger;
import org.codehaus.groovy.control.CompilationFailedException;

import java.io.UnsupportedEncodingException;
import java.security.NoSuchAlgorithmException;
import java.util.Map;

/**
 * groovy编译器
 */
public class GroovyCompiler {

    private final static Logger logger = Logger.getLogger(GroovyCompiler.class);

    private static final GroovyCompiler groovyCompiler = new GroovyCompiler();
    private static Map<String, Class<Script>> classScriptCacheMap = Maps.newConcurrentMap();

    public GroovyCompiler() {
    }

    public static GroovyCompiler getGroovyCompiler() {
        return groovyCompiler;
    }

    /**
     * 编译一个groovy脚本 得到一个Script对象
     *
     * @param
     * @return
     */
    public synchronized Class<Script> compile(ScriptDO scriptDO) {

        String scriptMD5Key = null;
        Class<Script> scriptClass = null;

        Class<Script> cachedScriptClass = null;

        try {
            scriptMD5Key = MD5Util.EncoderByMd5(scriptDO.getScript());
            System.out.println(scriptMD5Key + " " + scriptDO.getScript());

        } catch (NoSuchAlgorithmException e) {
            throw new TestPlatformException(TestPlatformErrorCode.ENCODE_EXCEPTION, e.getMessage());
        } catch (UnsupportedEncodingException e) {
            throw new TestPlatformException(TestPlatformErrorCode.ENCODE_EXCEPTION, e.getMessage());
        }
        cachedScriptClass = classScriptCacheMap.get(scriptMD5Key);

        System.out.println("classScriptCacheMap size:" + classScriptCacheMap.size());
        try {
            if (cachedScriptClass != null) {
                scriptClass = cachedScriptClass;
                System.out.println(scriptDO.getScript() + "get from cache");
            } else {
                GroovyClassLoader groovyLoader = CustomGroovyClassLoaderFactory.newClassLoaderWithImplictImport();
                logger.warn("start compile script:" + scriptDO.getName());
                if (StringUtils.isBlank(scriptDO.getScript())) { //为空不需要编译
                    return null;
                }
                scriptClass = (Class<Script>) groovyLoader.parseClass(scriptDO.getScript());

                logger.warn("compile end.");
                classScriptCacheMap.put(scriptMD5Key, scriptClass);
            }
        } catch (CompilationFailedException e) {
            throw new TestPlatformException(TestPlatformErrorCode.COMPILATION_ERROR, scriptDO.toString(), e);
        }
        return scriptClass;


    }
}
