package com.mxz.FacadePattern;

/**
 * 门面模式
 * Created by Administrator on 2019/9/4.
 */
public class client {
    public static void main(String[] args) {
        ModenPostOffice office = new ModenPostOffice();
        String context = "Hello,It's me,do you know who I am? I'm your old lover.I'd like to....";
        String address = "Happy Road No. 666,God Province,Heaven";
        office.sendLetter(context,address);
    }
}
