package Emyplyee;

public class CEO extends Employee {
    private int worker;

    public CEO(String name, String sureName, int age, int worker){
        super(name, sureName, age);
        this.worker = worker;
    }

    @Override
    public void work() {
        super.work();
    }

    public void showInfo() {
        super.showInfo();
        System.out.println("worker: " + worker);
    }
}
