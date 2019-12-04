package com.mxz.SingletonPattern;

/**单例模式
 * Created by Administrator on 2019/9/4.
 */
public class Emperor {

    private static Emperor emperor = null;

    public Emperor() {
    }

    public static Emperor getInstance(){
        if (emperor == null){
            emperor = new Emperor();
        }
        return emperor;
    }

    public static void emperorInfo(){
        System.out.println("我就是皇帝....");
    }
}
