package com.mxz.AdapterPattern;


import com.mxz.AdapterPattern.user.IUserInfo;

/**
 * 适配器模式
 * Created by Administrator on 2019/9/4.
 */
public class App {
    public static void main(String[] args) {
   /*     IUserInfoImpl userInfo = new IUserInfoImpl();
        for (int i = 0; i < 10; i++) {
            userInfo.getHomeAddress();
        }
        System.out.println("=========================");*/
        IUserInfo userInfo1 = new OuterUserInfo();
        for (int i = 0; i < 10; i++) {
            userInfo1.getHomeAddress();
        }
    }
}
