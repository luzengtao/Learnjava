package com.luzengtao.lessons3Test;

public class Employee {
    private static int nextId = 1;
    private String name;
    private double salary;
    private int id;

    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
        id = 0;
    }

    public static int getNextId() {
        return nextId;
    }



    public String getName() {
        return name;
    }



    public double getSalary() {
        return salary;
    }



    public int getId() {
        return id;
    }

    public void setId(int id) {
        id = nextId;
        nextId++;
    }

    public static void main(String[] args) {
        Employee e = new Employee("Herry",500);
        System.out.println(e.getName()+ "  "+e.getSalary());
    }
}
