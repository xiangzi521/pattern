package com.mxz.Thread;

/**
 * Created by Administrator on 2019/9/7.
 */
public class dddd {
    public static void main(String[] args) {
        method2();
    }

    public static void method2() {
        System.out.println("2"+6);
    }

    public void method1() {
        if (false || true) {
            System.out.println("true");
        }
        System.out.println("==================");
        if (false && false) {
            System.out.println("false");
        } else {
            System.out.println("true");
        }
    }
}
