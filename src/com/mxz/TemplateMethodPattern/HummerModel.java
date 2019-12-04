package com.mxz.TemplateMethodPattern;

/**模板方法
 * Created by Administrator on 2019/9/5.
 */
public abstract class HummerModel {

    protected abstract void start();
    //能发动，那还要能停下来，那才是真本事
    protected abstract void stop();
    //喇叭会出声音，是滴滴叫，还是哔哔叫
    protected abstract void alarm();
    //引擎会轰隆隆的响，不响那是假的
    protected abstract void engineBoom();
    //那模型应该会跑吧，别管是人推的，还是电力驱动，总之要会跑
    final public  void run() {
        //先发动汽车
        this.start();
        //引擎开始轰鸣
        this.engineBoom();
        //然后就开始跑了，跑的过程中遇到一条狗挡路，就按喇叭
        if (isAlarm()){
            this.alarm();
        }
        //到达目的地就停车
        this.stop();
    }

    //钩子方法，默认喇叭是会响的
    protected boolean isAlarm(){
        return true;
    }
}
