package com.mxz.ObserverPattern.common;

/**
 * Created by Administrator on 2019/9/9.
 */
public class HanFeiZi implements IHanFeiZi {
    //韩非子是否在吃饭，作为监控的判断标准
    private boolean isHaveBreakfast = false;
    //韩非子是否在娱乐
    private boolean isHaveFun = false;

    private LiSi liSi = new LiSi();

    @Override
    public void haveBreakfast() {
        System.out.println("韩非子:开始吃饭了...");
        this.liSi.update("韩非子在吃饭");
        //this.isHaveBreakfast =true;
    }

    @Override
    public void haveFun() {
        System.out.println("韩非子:开始娱乐了...");
        this.liSi.update("韩非子开始娱乐了");
        //this.isHaveFun = true;
    }

    public HanFeiZi(boolean isHaveBreakfast, boolean isHaveFun) {
        this.isHaveBreakfast = isHaveBreakfast;
        this.isHaveFun = isHaveFun;
    }

    public HanFeiZi() {
    }

    public boolean isHaveBreakfast() {
        return isHaveBreakfast;
    }

    public void setHaveBreakfast(boolean haveBreakfast) {
        isHaveBreakfast = haveBreakfast;
    }

    public boolean isHaveFun() {
        return isHaveFun;
    }

    public void setHaveFun(boolean haveFun) {
        isHaveFun = haveFun;
    }
}
