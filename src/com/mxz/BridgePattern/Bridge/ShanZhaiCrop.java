package com.mxz.BridgePattern.Bridge;


/**
 * Created by Administrator on 2019/9/5.
 */
public class ShanZhaiCrop extends Corp {

    /**
     * 实际传入的是 new XX() 这样的东西
     * @param product
     */
    public ShanZhaiCrop(Product product) {
        super(product);
    }

    public void makeMoney(){
        super.makeMoney();
        System.out.println("赚钱了...");
    }
}
