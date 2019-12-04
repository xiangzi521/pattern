package com.mxz.SingletonPattern;

/**
 * Created by Administrator on 2019/9/4.
 */
public class Minister {
    public static void main(String[] args) {
        Emperor emperor1 = new Emperor();
        emperor1.emperorInfo();

        Emperor emperor2 = new Emperor();
        emperor2.emperorInfo();

        Emperor emperor3 = new Emperor();
        emperor3.emperorInfo();

        System.out.println("。。。。改朝换代。。。。");

        System.out.println("第一天");
        SingletonPattern s1 = new SingletonPattern();
        s1.emperorInfo();
        System.out.println("第二天");
        SingletonPattern s2 = new SingletonPattern();
        s2.emperorInfo();
        System.out.println("第三天");
        SingletonPattern s3 = new SingletonPattern();
        s3.emperorInfo();

    }
}
