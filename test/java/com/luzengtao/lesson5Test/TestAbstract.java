package com.luzengtao.lesson5Test;

/*
*  abstract: 关键字，用于修饰类和方法
*
*  abstract 修饰的方法：没有方法体，只有方法的声明，这样的方法称为抽象方法。
*  abstract 修饰的类：抽象类。不能被实例化。
*
*  ps：
*  1.有抽象方法的类一定是抽象类，但抽象类中可以没有抽象方法。
*  2.不能用abstract修饰私有方法，构造方法，静态方法.
* */
public class TestAbstract {
    public static void main(String[] args) {
//        CC cc = new CC();

    }
}

    abstract class CC{
    abstract void test();
}