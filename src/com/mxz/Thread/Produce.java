package com.mxz.Thread;

/**
 * Created by Administrator on 2019/9/7.
 */
public class Produce implements Runnable {

    public static int chepiao = 100;
    public static String str = new String("weimeig");
    @Override
    public void run() {
        while (true) {
            synchronized (str) {//若不定义为static静态，则两个线程的str是线程自己的，而不是公共的，因为这种写法，初始化的str写在了锁的外面
                if(chepiao>0){
                    System.out.println("第" + Thread.currentThread().getName() + "个车站正在卖出第" + (101-chepiao) + "张车票");
                    --chepiao;
                }else{
                    break;
                }
            }
        }
    }
}
