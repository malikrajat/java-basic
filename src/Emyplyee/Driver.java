package Emyplyee;

public class Driver extends Employee{
    private int car;
    public Driver(String name, String sureName, int age, int car) {
        super(name, sureName, age);
        this.car = car;
    }

    @Override
    public void work() {
        super.work();
    }

    @Override
    public void showInfo() {
        super.showInfo();
        System.out.println("car :" + car);
    }
}
