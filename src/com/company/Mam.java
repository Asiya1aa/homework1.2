package com.company;

public class Mam extends Granmam{
private int age;
private double rost;

    public Mam(String name, int dog, int age, double rost) {
        super(name, dog);
        this.age = age;
        this.rost = rost;
    }

    public int getAge() {
        return age;
    }

    public double getRost() {
        return rost;
    }
    public final void legenda(String t){
        System.out.println( t);
    }
    public void legenda(int r){
        System.out.println(r);
    }
}
