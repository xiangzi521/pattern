package com.mxz.other;

import java.util.*;
import java.util.concurrent.ConcurrentHashMap;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

/**
 * Created by Administrator on 2019/9/17.
 */
public class other {
    public static void main(String[] args) {
//        demo1();
//        demo3();
//        demo4();
//        demo5();
//        demo6();

        //Consumer<demo> sayHello = demo::sayHello;
        //System.out.println(sayHello);

    }

    public static void demo6() {
        String k = "key";
        HashMap<String, Integer> map = new HashMap<String, Integer>() {{
            put(k, 1);
        }};
        map.merge(k, 2, (oldVal, newVal) -> oldVal + newVal);
        for (Map.Entry<String, Integer> m : map.entrySet()) {
            System.out.println(m.getKey());
            System.out.println(m.getValue());
        }
    }

    public static void demo5() {

        List<String> lines = Arrays.asList("21", "22", "3", "4");
        List<String> result1 = lines.stream()  // convert list to stream
                .filter(line -> !"22".equals(line)) // filter the line which equals to "22"
                .collect(Collectors.toList());  // collect the output and convert streams to a list

        result1.forEach(System.out::println); // o
    }

    public static void demo4() {
        List<Book> list = new ArrayList<>();
        list.add(new Book("Core Java", 200));
        list.add(new Book("Core Java", 300));
        list.add(new Book("Learning Freemarker", 150));
        list.add(new Book("Spring MVC", 200));
        list.add(new Book("Hibernate", 300));
        list.stream().filter(distinctByKey(b -> b.getName()))
                .forEach(b -> System.out.println(b.getName() + "," + b.getPrice()));
    }

    private static <T> Predicate<T> distinctByKey(Function<? super T, ?> keyExtractor) {
        Map<Object, Boolean> seen = new ConcurrentHashMap<>();
        return t -> seen.putIfAbsent(keyExtractor.apply(t), Boolean.TRUE) == null;
    }

    public static void demo3() {
        List<Book> list = new ArrayList<>();
        list.add(new Book("Core Java", 200));
        list.add(new Book("Core Java", 200));
        list.add(new Book("Learning Freemarker", 150));
        list.add(new Book("Spring MVC", 300));
        list.add(new Book("Spring MVC", 300));
        long l = list.stream().distinct().count();
        System.out.println("No. of distinct books:" + l);
        list.stream().distinct().forEach(b -> System.out.println(b.getName() + "," + b.getPrice()));
    }

    public static void demo1() {

        List<String> list = Arrays.asList("AA", "BB", "CC", "BB", "CC", "AA", "AA");
        long l = list.stream().distinct().count();
        System.out.println("No. of distinct elements:" + l);
        String output = list.stream().distinct().collect(Collectors.joining(","));
        System.out.println(output);
    }

    public static void demo2() {
        List<String> strArr = Arrays.asList("21", "22", "3", "4");

        strArr.stream().filter(str -> {
            return str.startsWith("2");
        }).filter(str -> {
            return str.equals("21");
        }).forEach(str -> {
            System.out.println(str);
        });
    }
}
