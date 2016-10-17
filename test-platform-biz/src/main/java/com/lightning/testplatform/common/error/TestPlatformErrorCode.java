package com.lightning.testplatform.common.error;

/**
 * Created by mingxin on 16/9/12.
 */
public enum  TestPlatformErrorCode {

    GENERAL_ERROR("系统异常"),
    COMPILATION_ERROR("脚本编译异常"),
    GROOVY_INSTANTIATION_ERROR("groovy类实例初始化错误"),
    ENCODE_EXCEPTION("脚本加密异常"),
    SCRIPT_CLASS_EMPTY("脚本为空"),
    bbb("bbb");


    TestPlatformErrorCode(String errorText) {
        this.errorText = errorText;
    }

    private String errorText;


    public String getErrorText() {
        return errorText;
    }

    public void setErrorText(String errorText) {
        this.errorText = errorText;
    }
}
