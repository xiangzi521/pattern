package com.mxz.ObserverPattern.common;

/**
 * Created by Administrator on 2019/9/9.
 */
public class watch extends Thread {
    private HanFeiZi hanFeiZi;
    private LiSi liSi;
    private String type;

    public watch(HanFeiZi hanFeiZi, LiSi liSi, String type) {
        this.hanFeiZi = hanFeiZi;
        this.liSi = liSi;
        this.type = type;
    }

    @Override
    public void run() {
        while (true){
            if (this.type.equals("breakfast")){
                if (this.hanFeiZi.isHaveFun()){
                    this.liSi.update("韩非子在吃早饭");
                    this.hanFeiZi.setHaveBreakfast(false);
                }
            }else {
                if (this.hanFeiZi.isHaveFun()){
                    this.liSi.update("韩非子在娱乐");
                    this.hanFeiZi.setHaveFun(false);
                }
            }
        }
    }
}
