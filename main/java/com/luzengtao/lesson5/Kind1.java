package com.luzengtao.lesson5;

public class Kind1 extends ManKind{
    private int yearsOld;

    public int getYearsOld() {
        return yearsOld;
    }

    public void setYearsOld(int yearsOld) {
        this.yearsOld = yearsOld;
    }

    public void printAge(){
        System.out.println(getYearsOld());
    }

    @Override
    public void employeed() {
        super.employeed();
        System.out.println("But kids should study and no job.");
    }

    public static void main(String[] args) {
        Kind1 someKid = new Kind1();
        someKid.setYearsOld(22);
        someKid.setSex(1);
        someKid.setSalary(1);
        someKid.manOrWorman();
        someKid.employeed();
        someKid.printAge();

    }
}
