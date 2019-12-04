package com.mxz.CommandPattern.command;

/**命令模式
 * Created by Administrator on 2019/9/5.
 */
public class client {
    public static void main(String[] args) {
        Invoker boss = new Invoker();
        System.out.println("需求来了...");
        Command command = new AddRequirementCommand();
        boss.setCommand(command);
        boss.action();
        System.out.println("需求来了...");
        Command command2 = new DeletePageCommand();
        boss.setCommand(command2);
        boss.action();
        System.out.println("需求来了...");
        CodeCommand codeCommand = new CodeCommand();
        boss.setCommand(codeCommand);
        boss.action();
    }
}
