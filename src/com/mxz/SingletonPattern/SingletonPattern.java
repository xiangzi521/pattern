package com.mxz.SingletonPattern;

/**
 * Created by Administrator on 2019/9/4.
 */
public class SingletonPattern {

    private static final SingletonPattern singletonPattern = new SingletonPattern();

    public SingletonPattern() {
    }

    public synchronized static SingletonPattern getInstance() {
        return singletonPattern;
    }

    public static void emperorInfo() {
        System.out.println("我就是皇帝....");
    }
}
