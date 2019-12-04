package com.mxz.InterpreterPattern.common;

import java.util.HashMap;

/**
 * Created by Administrator on 2019/9/24.
 */
public class AddExpression extends SymbolExpression {
    public AddExpression(Expression _left,Expression _right){
        super(_left,_right);
    }
    @Override
    public int interpreter(HashMap<String, Integer> var) {
        return super.left.interpreter(var) + super.right.interpreter(var);
    }
}
