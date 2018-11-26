package com.luzengtao.lesson5Test;
/*
*  1.final 关键字，可以修饰类、属性和方法，表示最终的；
*
*  final 修饰的属性，是最终的属性-属性值不能被修改，即常量；
*  1. 必须在声明时被初始化， 或在非静态代码块，或在构造器中初始化。
*
*  final 修饰的方法，是最终的方法-该方法不能被修改，即该方法不能被重写；
*
*  final 修饰的类，是最终的类-该类不能被扩展，即该类不能被继承；
*
* */
public class TesFinal {
}

class BB extends A{
//    @Override
//    void test() {
//        super.test();
//    }
}

class A {

    final void test(){}


   final int age;
    {
        age =12;
    }
    final String name = "" ;

    final int sex;
    A(){
        sex =1;
    }
}