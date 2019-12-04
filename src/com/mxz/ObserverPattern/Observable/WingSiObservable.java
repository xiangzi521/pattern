package com.mxz.ObserverPattern.Observable;
import java.util.Observable;
import java.util.Observer;
/**
 * Created by Administrator on 2019/9/9.
 */
public class WingSiObservable implements Observer {
  /*  @Override
    public void update(String context) {
        System.out.println("王斯：观察到王斯活动，开始向老板汇报了...");
        this.reportToQiShiHuang(context);
        System.out.println("王斯：汇报完毕，秦老板赏给他两个萝卜吃吃...\n");
    }*/

    //汇报给秦始皇
    private void reportToQiShiHuang(String reportContext){
        System.out.println("王斯：报告，秦老板！韩非子有活动了--->"+reportContext);
    }

    @Override
    public void update(Observable o, Object arg) {
        System.out.println("王斯：观察到王斯活动，开始向老板汇报了...-------------------");
        this.reportToQiShiHuang(arg.toString());
        System.out.println("王斯：汇报完毕，秦老板赏给他两个萝卜吃吃...---------------------\n");
    }
}
