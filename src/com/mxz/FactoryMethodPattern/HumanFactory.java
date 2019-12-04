package com.mxz.FactoryMethodPattern;

import java.util.HashMap;
import java.util.List;
import java.util.Random;

/**传递一个 .class 进去 然后利用反射获取对象
 * Created by Administrator on 2019/9/4.
 */
public class HumanFactory {
    private static HashMap<String, Human> humans = new HashMap<String, Human>();

    public static Human createHuman(Class c) {
        Human human = null;

        try {
            if (humans.containsKey(c.getSimpleName())) {
                human = humans.get(c.getSimpleName());
            } else {
                human = (Human) Class.forName(c.getName()).newInstance();
            }
        } catch (InstantiationException e) {
            System.out.println("指定人类的颜色");
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            System.out.println("这个人有问题");
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            System.out.println("这个人找不到");
            e.printStackTrace();
        }

        return human;
    }

    public static Human createHuman() {
        Human human = null; //定义一个类型的人类
        //首先是获得有多少个实现类，多少个人类
        List<Class> concreteHumanList = ClassUtils.getAllClassByInterface(Human.class); //定义了多少人类
        //八卦炉自己开始想烧出什么人就什么人
        Random random = new Random();
        int rand = random.nextInt(concreteHumanList.size());
        human = createHuman(concreteHumanList.get(rand));
        return human;
    }


}
