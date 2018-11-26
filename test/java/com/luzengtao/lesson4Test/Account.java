package com.luzengtao.lesson4Test;

public class Account {
    /*
    * 练习1：编写一个类，实现银行账户的概念，
    * 包含的属性有“帐号”、“密码”、“存款余额”、“利率”、“最小余额”，
    * 定义封装这些属性的方法。账号要自动生成。
    *
    *
    *
    * */
    private int id;
    private int balance;
    private String password;
    int age;

    static {
        System.out.println("静态代码块");
    }

    //非静态代码块：不带参数的构造器
    {
         age = 10;
        System.out.println("非静态代码块...");
    }
    private static double interestRate;
    private static int minBalance;

    private static int Intid = 1000;
    public Account(int balance, String password) {
        id = Intid++;//账号自动生成;
        this.balance = balance;
        this.password = password;
    }

    @Override
    public String toString() {
        return "Account{" +
                "id=" + id +
                ", balance=" + balance +
                ", password='" + password + '\'' +
                '}';
    }
}
