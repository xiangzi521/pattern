package com.mxz.MediatorPattern.Mediator;

/**中介者模式
 * Created by Administrator on 2019/9/18.
 */
public abstract class AbstractMediator {
    protected Purchase purchase;
    protected Sale sale;
    protected Stock stock;
    //构造函数
    public AbstractMediator(){
        purchase = new Purchase(this);
        sale = new Sale(this);
        stock = new Stock(this);
    }
    //中介者最重要的方法，叫做事件方法，处理多个对象之间的关系
    public abstract void execute(String str,Object...objects);
}
