package com.mxz.BridgePattern.Bridge;

/**
 * Created by Administrator on 2019/9/5.
 */
public class HouseCorp extends Corp {
    public HouseCorp(Product product) {
        super(product);
    }

    public void makeMoney() {
        super.makeMoney();
        System.out.println("房地产公司赚大钱了...");
    }
}
