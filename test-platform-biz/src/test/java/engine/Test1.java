package engine;

import com.google.common.collect.Lists;
import com.lightning.testplatform.common.groovy.GroovyExcuteEngine;
import com.lightning.testplatform.domain.ScriptDO;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by mingxin on 16/9/13.
 */
public class Test1 {
    public static void main(String[] args) {
        ScriptDO scriptDO = new ScriptDO();
        scriptDO.setScript("String A = a;return A;");
        Map<String, Object> context = new HashMap<String, Object>();
        context.put("a","hello");
        GroovyExcuteEngine groovyExcuteEngine = GroovyExcuteEngine.getGroovyExcuteEngine();
        Object object = groovyExcuteEngine.execute(scriptDO,context);
        System.out.println(object);
    }
}
