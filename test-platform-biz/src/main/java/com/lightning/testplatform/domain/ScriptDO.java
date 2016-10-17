package com.lightning.testplatform.domain;

/**
 * Created by mingxin on 16/9/12.
 */
public class ScriptDO {

    private Long id;
    private String name;
    private String script;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getScript() {
        return script;
    }

    public void setScript(String script) {
        this.script = script;
    }

    @Override
    public String toString() {
        return "RuleScriptDO{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", script='" + script + '\'' +
                '}';
    }
}
