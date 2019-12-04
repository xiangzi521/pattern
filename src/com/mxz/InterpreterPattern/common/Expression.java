package com.mxz.InterpreterPattern.common;

import java.util.HashMap;

/**解释器模式
 * Created by Administrator on 2019/9/24.
 */
public abstract class Expression {
    //解析公式和数值,其中var中的key值是是公式中的参数，value值是具体的数字
    public abstract int interpreter(HashMap<String,Integer> var);
}
