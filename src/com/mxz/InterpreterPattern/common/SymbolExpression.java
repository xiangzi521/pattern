package com.mxz.InterpreterPattern.common;

/**
 * Created by Administrator on 2019/9/24.
 */
public abstract class SymbolExpression extends Expression {

    protected Expression left;
    protected Expression right;

    public SymbolExpression(Expression left, Expression right) {
        this.left = left;
        this.right = right;
    }
}
