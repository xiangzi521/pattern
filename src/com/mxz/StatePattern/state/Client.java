package com.mxz.StatePattern.state;

/**预先定义出所有的状态 然后在该状态下可以做的一些行为
 * Created by Administrator on 2019/9/18.
 */
public class Client {
    public static void main(String[] args) {
        Context context = new Context();
        context.setLiftState(new ClosingState());
        context.open();
        context.close();
        context.run();
        context.stop();
    }
}
