package com.mxz.InterpreterPattern.common;

import java.util.Stack;

/**
 * Created by Administrator on 2019/9/24.
 */
public class Calculator {

    private Expression expression;

    public Calculator(String expression) {
        Stack<Expression> stack = new Stack<Expression>();
        //表达式拆分为字符数组
        char[] charArray = expression.toCharArray();
        //运算
        Expression left = null;
        Expression right = null;
        for (int i = 0; i < charArray.length; i++) {
            switch (charArray[i]) {
                case '+': //加法
        //加法结果放到堆栈中
                    left = stack.pop();
                    right = new VarExpression(String.valueOf(charArray[++i]));
                    stack.push(new AddExpression(left, right));
                    break;
                case '-':
                    left = stack.pop();
                    right = new VarExpression(String.valueOf(charArray[++i]));
                    stack.push(new SubExpression(left, right));
                    break;
                default: //公式中的变量
                    stack.push(new VarExpression(String.valueOf(charArray[i])));
            }
        }
        //把运算结果抛出来
        this.expression = stack.pop();
    }
}
