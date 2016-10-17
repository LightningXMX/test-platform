package com.lightning.testplatform.common.util;

import org.apache.commons.lang.Validate;

/**
 * Created by mingxin on 16/8/22.
 */
public class Paginator {

    private long totalNum;// 数据库总条数(外部传入)
    private int currentPageNum;// 当前第几页(外部传入)
    public static final int defaultPageSize = 10;// 每页多少条数据
    private int pageSize;//每页多少条记录
    private int totalPageSize;// 一共多少页
    private int startRow;// 数据库的起始搜索位置


    public Paginator(int currentPageNum) {
        this(currentPageNum, defaultPageSize);

    }

    public Paginator(int currentPageNum, int pageSize) {
        Validate.isTrue(currentPageNum > 0 && startRow >= 0);
        this.currentPageNum = currentPageNum;
        this.startRow = (currentPageNum - 1) * pageSize;
        this.pageSize = pageSize;
    }

    public int getPageSize() {
        return pageSize;
    }

    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }

    public long getTotalNum() {
        return totalNum;
    }

    public void setTotalNum(long totalNum) {
        this.totalNum = totalNum;
        //// TODO: 16/8/25
        if (totalNum <= 0) {
            totalNum = 1;
        }
        this.totalPageSize = (int) Math.ceil((double) totalNum / (double) getPageSize());


    }

    public int getTotalPageSize() {
        return totalPageSize;
    }

    public int getCurrentPageNum() {
        return currentPageNum;
    }

    public static void main(String[] args) {
        Paginator paginator = new Paginator(2);//第一页
        paginator.setTotalNum(19);//一共多少记录
    }
}
