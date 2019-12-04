package com.mxz.AbstractFactoryMethodPattern;

/**
 * Created by Administrator on 2019/9/4.
 */
public enum HumanEnum {

    BlackMaleHuman("com.mxz.AbstractFactoryMethodPattern.Black.BlackMaleHuman"),
    BlackFemaleHuman("com.mxz.AbstractFactoryMethodPattern.Black.BlackFemaleHuman"),
    WhiteMaleHuman("com.mxz.AbstractFactoryMethodPattern.White.WhiteMaleHuman"),
    WhiteFemaleHuman("com.mxz.AbstractFactoryMethodPattern.White.WhiteFemaleHuman"),
    YellowMaleHuman("com.mxz.AbstractFactoryMethodPattern.Yellow.YellowMaleHuman"),
    YellowFemaleHuman("com.mxz.AbstractFactoryMethodPattern.Yellow.YellowFemaleHuman");

    private String value = "";

    //定义构造函数，目的是Data(value)类型的相匹配
    private HumanEnum(String value) {
        this.value = value;
    }

    public String getValue() {
        return this.value;
    }
    }
