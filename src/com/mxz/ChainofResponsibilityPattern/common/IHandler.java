package com.mxz.ChainofResponsibilityPattern.common;

/**
 * Created by Administrator on 2019/9/9.
 */
public interface IHandler {
    //一个女性（女儿，妻子或者是母亲）要求逛街，你要处理这个请求
    public void HandleMessage(IWomen women);
}
