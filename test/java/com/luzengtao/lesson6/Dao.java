package com.luzengtao.lesson6;

/*
*  接口：
*  1.使用interface 声明
*  2.接口是抽象方法和常量的集合，不能再有其他的任何成分；
*  3.接口中方法的默认修饰为：public abstract
*  4.接口中常量默认修饰为：public static final
*      常量的命名规范：多个单词组成，每个字母都需要大写，且多个单词使用 _ 连接；
*
*  5.实现接口使用 implements 关键字；
*  6.一个类可以实现多个接口；
*  7.接口之间可以继承,使用extends；
*  8.若一个类既实现接口，又继承父类，则extends 在 implements 前面。
*
*
* */
public interface Dao {
//  常量的默认修饰为 public static final
    String QUERY_SQL = "SELECT...";



//    接口中的方法默认修饰为：public abstract
    void save();

    Object get();

    void deleta();

    Object [] qrery();

}
