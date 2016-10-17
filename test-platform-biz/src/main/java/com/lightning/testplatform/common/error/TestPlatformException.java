package com.lightning.testplatform.common.error;

/**
 * Created by mingxin on 16/9/12.
 */
public class TestPlatformException extends RuntimeException {


    private TestPlatformErrorCode testPlatformErrorCode;
    private String msg;

    public TestPlatformException(TestPlatformErrorCode testPlatformErrorCode, java.lang.String msg, Throwable cause) {
        super(msg, cause);
        this.testPlatformErrorCode = testPlatformErrorCode;
        this.msg = msg;
    }

    public TestPlatformException(TestPlatformErrorCode testPlatformErrorCode) {
        this(testPlatformErrorCode, null, null);
    }

    public TestPlatformException(String msg, Throwable cause) {
        this(TestPlatformErrorCode.GENERAL_ERROR, msg, cause);
    }

    public TestPlatformException(TestPlatformErrorCode errorCode, String msg) {
        this(errorCode, msg, null);
    }
}
