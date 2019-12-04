package com.mxz.TemplateMethodPattern;

/**
 * Created by Administrator on 2019/9/5.
 */
public class HummerH1Model extends HummerModel {

    private boolean alarmFlag = true;

    @Override
    public void start() {
        System.out.println("悍马H1启动...");
    }

    @Override
    public void stop() {
        System.out.println("悍马H1停车...");
    }

    @Override
    public void alarm() {
        System.out.println("悍马H1鸣笛...");
    }

    @Override
    public void engineBoom() {
        System.out.println("悍马H1引擎声音是这样在...");
    }

    @Override
    protected boolean isAlarm() {
        return this.alarmFlag;
    }

    //要不要响喇叭，是有客户的来决定的
    public void setAlarm(boolean isAlarm){
        this.alarmFlag = isAlarm;
    }

}
