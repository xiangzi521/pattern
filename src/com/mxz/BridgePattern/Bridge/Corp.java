package com.mxz.BridgePattern.Bridge;

/**
 * Created by Administrator on 2019/9/5.
 */
public abstract class Corp {
    private Product product;

    public Corp(Product product) {
        this.product = product;
    }

    public void makeMoney(){
        this.product.beProducted();
        this.product.beSelled();
    }
}
