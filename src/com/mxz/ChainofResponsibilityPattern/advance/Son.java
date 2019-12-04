package com.mxz.ChainofResponsibilityPattern.advance;

import com.mxz.ChainofResponsibilityPattern.common.IWomen;

/**
 * Created by Administrator on 2019/9/9.
 */
public class Son extends Handler {

    public Son(){
        super(3);
    }
    @Override
    public void response(IWomen women) {
        System.out.println("--------母亲向儿子请示-------");
        System.out.println(women.getRequest());
        System.out.println("儿子的答复是：同意\n");
    }
}
