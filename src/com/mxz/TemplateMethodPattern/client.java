package com.mxz.TemplateMethodPattern;

/**
 * Created by Administrator on 2019/9/5.
 */
public class client {
    public static void main(String[] args) {
        HummerH1Model h1 = new HummerH1Model();
        h1.run();
        System.out.println("========================");
        HummerH2Model h2 = new HummerH2Model();
        h2.run();
    }
}
