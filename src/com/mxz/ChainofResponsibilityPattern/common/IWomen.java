package com.mxz.ChainofResponsibilityPattern.common;

/**责任链模式
 * Created by Administrator on 2019/9/9.
 */
public interface IWomen {
    //获得个人状况
    public int getType();
    //获得个人请示，你要干什么？出去逛街？约会?还是看电影
    public String getRequest();
}
