package com.lightning.testplatform.common.groovy;

import com.google.common.collect.Maps;
import com.lightning.testplatform.common.error.TestPlatformErrorCode;
import com.lightning.testplatform.common.error.TestPlatformException;
import com.lightning.testplatform.common.util.MD5Util;
import com.lightning.testplatform.domain.ScriptDO;
import groovy.lang.Binding;
import groovy.lang.Script;

import java.io.UnsupportedEncodingException;
import java.security.NoSuchAlgorithmException;
import java.util.Map;

/**
 * Created by mingxin on 16/9/12.
 */
public class GroovyExcuteEngine {

    private static final GroovyExcuteEngine groovyExcuteEngine = new GroovyExcuteEngine();

    public GroovyExcuteEngine() {
    }

    public static GroovyExcuteEngine getGroovyExcuteEngine() {
        return groovyExcuteEngine;
    }

    private static GroovyCompiler groovyCompiler = GroovyCompiler.getGroovyCompiler();


    public static Object execute(ScriptDO scriptDO, Map<String, Object> context) {

        Class<Script> scriptClass = null;
        scriptClass = groovyCompiler.compile(scriptDO);
        if (scriptClass == null){
            throw new TestPlatformException(TestPlatformErrorCode.SCRIPT_CLASS_EMPTY);
        }

        Object executeResult = null;
        try {
            Script scriptInstance = scriptClass.newInstance();
            Binding binding;
//            if (isOptimize.get()) {
//                if( customMetaClassMap.get(scriptClass)==null){
//                    customMetaClassMap.put(scriptClass,new CustomMetaClassImpl(scriptClass));
//                }
//                scriptInstance.setMetaClass(customMetaClassMap.get(scriptClass));
//                binding=new CustomBinding(systemContext,appContext);
//            }else{
            binding = new Binding();
            setProperty(binding, context);
//            }

            scriptInstance.setBinding(binding);

//            BindingContextHolder.setBinding(binding);

//            if (scriptAndNodeCachedMap.get(script.getName()) != null) {
//                RuleNode cachedNode = scriptAndNodeCachedMap.get(script.getName());
//                binding.setVariable("__cachedRuleNode__", cachedNode);
//            }
//            else {
//                binding.setVariable("__cachedRuleNode__", null);
//            }
            System.out.println("run script");
            executeResult = scriptInstance.run();

//            if (RuleNode.class.isInstance(ruleResult)) {
//                RuleNode ruleNode = (RuleNode) ruleResult;
//                if (ruleNode.condition()) {
//                    executeResult = ruleNode.execute();
//                }
//            }else{
//                executeResult=ruleResult;
//            }

        } catch (InstantiationException e) {
            throw new TestPlatformException(TestPlatformErrorCode.GROOVY_INSTANTIATION_ERROR, e.getMessage());
        } catch (IllegalAccessException e) {
            throw new TestPlatformException(TestPlatformErrorCode.GROOVY_INSTANTIATION_ERROR, e.getMessage());
        } finally {
//            BindingContextHolder.clear();
        }
        return executeResult;
    }

    private static void setProperty(Binding binding, Map<String, Object> context) {

        if (context != null) {
            for (Map.Entry<String, Object> entry : context.entrySet()) {
                binding.setProperty(entry.getKey(), entry.getValue());
            }
        }

    }
}
