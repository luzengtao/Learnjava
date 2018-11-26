package com.luzengtao.lesson5Test;

/*
* 定义一个Employee类.
* 该类包含：private成员变量name,number,birthday.
* 其中birthday 为MyDate类的对象；
* abstract方法earnings; toString()方法输出对象的name，number和birthday。
*
* */
public abstract class Employee {

    protected String name;
    protected int number;
    protected MyDate birthday;

    abstract int earnings();

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", number=" + number +
                ", birthday=" + birthday +
                '}';
    }

    public Employee(String name, int number, MyDate birthday) {
        this.name = name;
        this.number = number;
        this.birthday = birthday;
    }

    public MyDate getBirthday() {
        return birthday;
    }
}
