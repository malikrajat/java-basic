package Emyplyee;

public class Programmer extends Employee {

    private String language;

    public Programmer(String name, String sureName, int age, String language){
        super(name, sureName, age);
        this.language = language;
    }

    @Override
    public void work() {
        super.work();
    }

    public void showInfo() {
        super.showInfo();
        System.out.println("Language: " + language);
    }
}
