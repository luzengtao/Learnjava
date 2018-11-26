package com.luzengtao.lesson5Test;
/*
 *定义SalariedEmployee 类继承Employee类，实现按月计算工资的员工处理。该类包括：private成员变量weeklySalary；
 * 实现父类的抽象方法earnings（），该方法返回weeklySalary值，toString()方法输出员工类型信息及员工的name，
 * number，birthday
 * */
public class SalariedEmployee extends Employee{

    private int weeklySalary;

    @Override
    int earnings() {
        return weeklySalary ;
    }

    @Override
    public String toString() {
        return "SalariedEmployee" +super.toString();
    }

    public SalariedEmployee(String name, int number, MyDate birthday, int weeklySalary) {
        super(name, number, birthday);
        this.weeklySalary = weeklySalary;
    }
}
