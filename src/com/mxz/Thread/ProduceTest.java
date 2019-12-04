package com.mxz.Thread;

/**
 * Created by Administrator on 2019/9/7.
 */
public class ProduceTest {
    public static void main(String[] args) {
        Thread t1 = new Thread(new Produce());
        t1.start();
        Thread t2 = new Thread(new Produce());
        t2.start();
        Thread t3 = new Thread(new Produce());
        t3.start();
    }
}
