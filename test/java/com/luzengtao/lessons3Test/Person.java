package com.luzengtao.lessons3Test;

public class Person {
    private String name;
    private int age;
    private String school;
    private String major;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Person(String name, int age, String school) {
        this.name = name;
        this.age = age;
        this.school = school;
    }

    public Person(String name, int age, String school, String major) {
        this.name = name;
        this.age = age;
        this.school = school;
        this.major = major;
    }
    public void getINfo(){
        System.out.println("name:"+name+",age:"+age+",school:"+school+",major:"+major);
    }

    public static void main(String[] args) {
        Person person = new Person("张大",22);
        Person person1 = new Person("张二",20,"留良初中");
        Person person2 = new Person("张三",19,"留良小学","IT");
        person.getINfo();
        person1.getINfo();
        person2.getINfo();

    }

}
