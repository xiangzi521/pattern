package com.mxz.InterpreterPattern.common;

import java.util.HashMap;

/**
 * Created by Administrator on 2019/9/24.
 */
public class VarExpression extends Expression {
    private String key;

    public VarExpression(String _key){
        this.key = _key;
    }
    @Override
    public int interpreter(HashMap<String, Integer> var) {
        return var.get(this.key);
    }
}
