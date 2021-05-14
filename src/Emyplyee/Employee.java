package Emyplyee;

public class Employee {
    private String name;
    private String sureName;
    private int age;

    public  Employee (String name, String sureName, int age){
        this.age = age;
        this.name = name;
        this.sureName = sureName;
    }
    public void work() {
        System.out.println(name + " is working.");
    }
    public void showInfo(){
        System.out.println("SurName : "+ this.sureName);
        System.out.println("Name : "+ this.name);
        System.out.println("Age : "+ this.age);
    }
}
