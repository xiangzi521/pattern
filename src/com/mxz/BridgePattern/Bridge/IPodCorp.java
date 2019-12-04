package com.mxz.BridgePattern.Bridge;

import com.mxz.BridgePattern.Corp;

/**
 * Created by Administrator on 2019/9/5.
 */
public class IPodCorp extends Corp {
    @Override
    protected void produce() {
        System.out.println("我生产iPod...");
    }

    @Override
    protected void sell() {
        System.out.println("iPod畅销...");
    }

    //狂赚钱
    public void makeMoney(){
        super.makeMoney();
        System.out.println("我赚钱呀...");
    }
}
