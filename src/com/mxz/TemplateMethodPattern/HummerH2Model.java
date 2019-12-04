package com.mxz.TemplateMethodPattern;

/**
 * Created by Administrator on 2019/9/5.
 */
public class HummerH2Model extends HummerModel {
    @Override
    public void start() {
        System.out.println("悍马H2启动...");
    }

    @Override
    public void stop() {
        System.out.println("悍马H2停车...");
    }

    @Override
    public void alarm() {
        System.out.println("悍马H2鸣笛...");
    }

    @Override
    public void engineBoom() {
        System.out.println("悍马H2引擎声音是这样在...");
    }


    @Override
    protected boolean isAlarm() {
        return false;
    }

}
