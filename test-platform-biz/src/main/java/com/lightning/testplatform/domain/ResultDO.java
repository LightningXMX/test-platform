package com.lightning.testplatform.domain;

import com.google.common.collect.Lists;
import org.apache.commons.collections.CollectionUtils;
import org.apache.commons.lang.StringUtils;

import java.util.List;


/**
 * Created by mingxin on 16/5/24.
 */
public class ResultDO<T> {

    private boolean success = false;

    private String errorMsg;

//    private List<T> list = Lists.newArrayList();

    private T module;

    public ResultDO(boolean success) {
        this.success = success;
    }

    public ResultDO() {
    }


    public String getErrorMsg() {
        return errorMsg;
    }


    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public void setErrorMsg(String errorMsg) {
        if (StringUtils.isNotBlank(errorMsg)){
            this.errorMsg = errorMsg;
            this.setSuccess(false);
        }
    }

//    public void setModuleList(List<T> list){
//        if (CollectionUtils.isNotEmpty(list)){
//            this.list = list;
//        }
//    }
//
//    public List<T> getModuleList() {
//        return list;
//    }


    public T getModule() {
        return module;
    }

    public void setModule(T module) {
        this.module = module;
    }
}
