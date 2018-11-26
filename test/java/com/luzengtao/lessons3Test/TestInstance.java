package com.luzengtao.lessons3Test;

import org.testng.annotations.Test;

public class TestInstance {



    /*建立TestInstance 类，在类中定义方法method1(Person e);
      在method1中:
    (1)根据e的类型调用相应类的getInfo()方法。
    (2)根据e的类型执行：
    如果e为Person类的对象，输出：“a person”;
    如果e为Student类的对象，输出“a student”“a person ”
    如果e为Graduate类的对象，输出：“a graduated student”“a student”“a person”
    * */
    public static void main(String[] args) {
        TestInstance ti = new TestInstance();
        Person p1 = new Person();
        Student student = new Student();
        Graduate graduate = new Graduate();
        ti.method1(p1);
        System.out.println();

        ti.method1(student);
        System.out.println();

        ti.method1(graduate);
        if (p1 instanceof Person) {
            System.out.println("a person");
        }
        if (student instanceof Student) {
            System.out.println("a student");
        }
        if (graduate instanceof Graduate) {
            System.out.println("a graduated student");
        }

    }
    public void method1 (Person e){
        String info = e.getInfo();
        System.out.println(info);
    }
    static class Person {
        protected String name = "person";
        protected int age = 50;

        public String getInfo() {
            return "Name: " + name + "\n" + "age: " + age;
        }
    }

    static class Student extends Person {
        protected String school = "pku";

        public String getInfo() {
            return "Name: " + name + "\nage: " + age
                    + "\nschool: " + school;
        }

    }

    static class Graduate extends Student {
        public String major = "IT";

        public String getInfo() {
            return "Name: " + name + "\nage: " + age
                    + "\nschool: " + school + "\nmajor:" + major;
        }
    }

}
