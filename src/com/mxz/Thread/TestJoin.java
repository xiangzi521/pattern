package com.mxz.Thread;

/**
 * Created by Administrator on 2019/9/7.
 */
public class TestJoin {
    public static void main(String[] args) throws InterruptedException {
        Thread thread2 = new Thread(new JoinThread(),"thread2");
        Thread thread1 = new Thread(new JoinThread(),"thread1");;
        Thread thread3 = new Thread(new JoinThread(),"thread3");;

        thread1.start();
        thread1.join();
        thread2.start();
        thread2.join();
        thread3.start();

    }

    static class JoinThread implements Runnable {

        @Override
        public void run() {
            for(int i=0; i<3; i++) {
                try {
                    System.out.println(Thread.currentThread().getName());
                    Thread.sleep(10);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
