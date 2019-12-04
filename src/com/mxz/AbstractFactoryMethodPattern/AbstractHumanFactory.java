package com.mxz.AbstractFactoryMethodPattern;

/**抽象工厂
 * Created by Administrator on 2019/9/4.
 */
public abstract class AbstractHumanFactory implements HumanFactory {

    protected Human createHuman(HumanEnum humanEnum){
        Human human = null;

        if (!humanEnum .getValue().equals("")){
            try {
                human = (Human) Class.forName(humanEnum.getValue()).newInstance();
            }catch (Exception e ){
                e.printStackTrace();
            }
        }
        return human;

    }

}
