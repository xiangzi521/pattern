package com.mxz.InterpreterPattern.common;

import java.util.HashMap;

/**
 * Created by Administrator on 2019/9/24.
 */
public class SubExpression extends SymbolExpression {

    public SubExpression(Expression _left,Expression _right){
        super(_left,_right);
    }

    @Override
    public int interpreter(HashMap<String, Integer> var) {
        return super.left.interpreter(var) - super.right.interpreter(var);
    }
}
