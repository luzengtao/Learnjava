package com.luzengtao.lessons3Test;

public class TestStatic {
    /*
    * 1.static 是一个关键字：用于修饰类的成员（属性、方法、内部类）；
    * 2.访问权限允许的情况下，static修饰的成员可以通过类名.方法来访问，
    *   即可以在不创建对象的情况下访问。当然也可以通过对象.方式来访问。
    * 3.static 修饰的成员为类成员，为类的所有实例所共享；
    * 4.在static方法内部只能访问类的static属性，不能访问类的非static属性。反之非static方法可以访问static成员
    * 5.因为不需要实例就可以访问static方法，因此static方法内部不能有this,(也不能有super ? )
    * 6.静态初始化：static修饰的代码块，当类被载入时执行，且只被执行一次，静态块经常用来进行类属性的初始化。
    * 7.所谓类的单态设计模式，就是采取一定的方法保证在整个的软件系统中，对某个类只能存在一个对象实例。
     * */

    static String name;
    int age;

    static void test(){ }
    void method(){}

    public static void main(String[] args) {
        TestStatic.name = "";
        TestStatic.test();

        TestStatic ts = new TestStatic();
        ts.name = "ABC";
        ts.age = 12;
        ts.method();
        System.out.println(ts.name);


        TestStatic ts2 = new TestStatic();
        System.out.println(ts2.name);
        ts2.name = "AABBCC";
        System.out.println(ts.name);



    }
}
