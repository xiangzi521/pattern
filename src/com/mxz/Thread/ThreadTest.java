package com.mxz.Thread;

/**
 * wait()和notify() 需要使用同一把钥匙(同一个对象) syn锁使用的是对象锁
 * Created by Administrator on 2019/9/7.
 */
public class ThreadTest {
    private final Object flag = new Object();

    public static void main(String[] args) {
        ThreadTest threadTest = new ThreadTest();
        ThreadA threadA = threadTest.new ThreadA();
        threadA.start();
        ThreadB threadB = threadTest.new ThreadB();
        threadB.start();
    }

    class ThreadA extends Thread {
        @Override
        public void run() {
            synchronized (flag) {
                for (int i = 0; i <= 100; i += 2) {
                    flag.notify();
                    System.out.println(i);
                    System.out.println("<<<<<<<<<<<<<<<<<<<<<<<<");
                    try {
                        flag.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }

        }
    }

    class ThreadB extends Thread {
        @Override
        public void run() {
            synchronized (flag) {
                for (int i = 1; i < 100; i += 2) {
                    flag.notify();
                    System.out.println(i);
                    System.out.println(">>>>>>>>>>>>>>>>>>>>>>");
                    try {
                        flag.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }
    }
}
