package com.mxz.AbstractFactoryMethodPattern;

/**
 * 静态工厂
 * Created by Administrator on 2019/9/4.
 */
public class NvWa {
    public static void main(String[] args) {
        //第一条生产线，男性生产线
        HumanFactory maleHumanFactory = new MaleHumanFactory();
        //第二条生产线，女性生产线
        HumanFactory femaleHumanFactory = new FemaleHumanFactory();
        //生产线建立完毕，开始生产人了:
        Human maleYellowHuman = maleHumanFactory.createYellowHuman();
        Human femaleYellowHuman = femaleHumanFactory.createYellowHuman();
        maleYellowHuman.cry();
        maleYellowHuman.laugh();
        maleYellowHuman.talk();
        femaleYellowHuman.sex();
        maleYellowHuman.sex();

    }

}
