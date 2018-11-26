package com.luzengtao.lesson6;

import com.luzengtao.lesson6.TestInterface.CompareObject;

public class TestInnerClass {



    public static void main(String[] args) {

//        2.在类的外部如何创建内部类对象？
//          2.1 对于非静态内部类：必须先创建外部类对象，然后再创建内部类对象
        OutClass oc = new OutClass();
        OutClass.InnerClass ic = oc.new InnerClass();
            ic.test();

//           2.2 静态内部类：内部类使用static 来修饰，所以创建该类的对象可以没有外部类对象
            OutClass.StaticInnerClass sic = new OutClass.StaticInnerClass();
//        1.在类的内部直接创建一个comaprareObject 接口的一个实现类对象。
//        匿名内部类对象。
       /* CompareObject compareObject = new CompareObject() {
            @Override
            public int compareTo(Object o1, Object o2) {
                return 0;
            }
        };*/
    }

}
