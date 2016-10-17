package engine;

import com.lightning.testplatform.common.groovy.GroovyExcuteEngine;
import com.lightning.testplatform.domain.ScriptDO;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by mingxin on 16/9/13.
 */
public class Test2 {
    public static void main(String[] args) {
        for (int i = 0; i < 1000; i++) {
            new Thread(()->{
                ScriptDO scriptDO = new ScriptDO();
                scriptDO.setScript("return \"a\";");
                Map<String, Object> context = new HashMap<String, Object>();
                GroovyExcuteEngine groovyExcuteEngine = GroovyExcuteEngine.getGroovyExcuteEngine();
                Object object = groovyExcuteEngine.execute(scriptDO,context);
                System.out.println(object);
            }).start();
        }
    }
}
