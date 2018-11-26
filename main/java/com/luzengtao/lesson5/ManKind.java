package com.luzengtao.lesson5;

public class ManKind {
    private int sex;
    private int salary;

    public int getSex() {
        return sex;
    }

    public void setSex(int sex) {
        this.sex = sex;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public void manOrWorman(){
        if (sex ==1){
            System.out.println("man");
        }else if(sex ==0){
            System.out.println("women");
        }
    }
    public void employeed(){
        if (salary ==0){
            System.out.println("no job");
        }else if (salary !=0){
            System.out.println("job");
        }
    }


}
