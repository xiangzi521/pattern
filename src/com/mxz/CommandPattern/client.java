package com.mxz.CommandPattern;

/**
 * Created by Administrator on 2019/9/5.
 */
public class client {
    public static void main(String[] args) {
        System.out.println("需求来了。。。。");
        RequirementGroup rg = new RequirementGroup();
        rg.find();
        rg.add();
        rg.plan();
        System.out.println("需求来了。。。。");
        CodeGroup cg = new CodeGroup();
        cg.find();
        cg.add();
        cg.plan();
    }
}
