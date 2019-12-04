package com.mxz.ObserverPattern.advance;

/**
 * Created by Administrator on 2019/11/22.
 */
public class ZhangSan implements Observer {
    @Override
    public void update(String context) {
        System.out.println("张三：观察到韩非子活动，开始向老板汇报了...");
        this.reportToQiShiHuang(context);
        System.out.println("张三：汇报完毕，秦老板赏给他两个萝卜吃吃...\n");
    }

    //汇报给秦始皇
    private void reportToQiShiHuang(String reportContext){
        System.out.println("张三：报告，秦老板！韩非子有活动了--->"+reportContext);
    }
}
