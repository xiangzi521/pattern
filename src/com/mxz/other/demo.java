package com.mxz.other;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2019/9/17.
 */
public class demo {
    public static void main(String[] args) {
        sayHello();
    }

    public static void sayHello(){
        System.out.println("hello ...");
        List list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);

        Object o = list.stream().filter(m -> list.get(0) == "1").findAny().orElse(22);
        System.out.println(o);
    }
}
