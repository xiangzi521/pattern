package com.mxz.ProxyPattern;

/**
 * Created by Administrator on 2019/9/4.
 */
public class WangPo implements KindWomen {

    private KindWomen woman;

    public WangPo() {
        this.woman = new PanJinLian();// 给一个默认值
    }

    public WangPo(KindWomen woman) {
        this.woman = woman;
    }

    @Override
    public void makeEyesWithMan() {
        System.out.println("WangPo.. makeEyesWithMan");
    }

    @Override
    public void happyWithMan() {
        System.out.println("WangPo.. happyWithMan");
    }
}
