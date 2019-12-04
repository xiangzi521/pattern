package com.mxz.DecoratorPattern.common;

/**装饰者模式
 * Created by Administrator on 2019/9/5.
 */
public abstract class SchoolReport {
    //成绩单的主要展示的就是你的成绩情况
    public abstract void report();
    //成绩单要家长签字，这个是最要命的
    public abstract void sign(String name);
}
