package com.mxz.Proxy;

/** 动态代理
 * Created by Administrator on 2020/6/30.
 */
public class client {
    public static void main(String[] args) throws NoSuchMethodException {
        Student student = new Student("大飞哥");
        Object instance = ProxyUtil.getProxyInstance(student);
        Person person = (Person) instance;
        person.giveMoney();

    }
}
