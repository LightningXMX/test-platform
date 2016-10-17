package com.lightning.testplatform.common.groovy;

import groovy.lang.GroovyClassLoader;
import org.codehaus.groovy.control.CompilerConfiguration;
import org.codehaus.groovy.control.customizers.ImportCustomizer;


public class CustomGroovyClassLoaderFactory {
    public static CompilerConfiguration config = CompilerConfiguration.DEFAULT;

    public static ImportCustomizer importCustomizer = new ImportCustomizer();

    static {
//        importCustomizer.addImports( "groovy.transform.Field");
//        importCustomizer.addStaticStars("com.taobao.trade.rule.model.Rule");
        config.addCompilationCustomizers(importCustomizer);
    }

    public static GroovyClassLoader newClassLoader(){
        return new GroovyClassLoader();
    }
    //初始化一个带有隐士引入的 groovyclassloader
    public static GroovyClassLoader newClassLoaderWithImplictImport() {
        return new GroovyClassLoader(Thread.currentThread().getContextClassLoader(), config);
    }

    //初始化一个带有隐士引入的 groovyclassloader
    public static GroovyClassLoader newClassLoaderWithImplictImportAndConfig(CompilerConfiguration config) {
        config.addCompilationCustomizers(importCustomizer);
        return new GroovyClassLoader(Thread.currentThread().getContextClassLoader(), config);
    }


}
