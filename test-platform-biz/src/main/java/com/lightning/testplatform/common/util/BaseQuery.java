package com.lightning.testplatform.common.util;

import java.io.Serializable;

/**
 * Created by mingxin on 16/8/25.
 */
public abstract class BaseQuery implements Serializable{
    private Paginator paginator;

    public Paginator getPaginator() {
        return paginator;
    }

    public void setPaginator(Paginator paginator) {
        this.paginator = paginator;
    }
}
