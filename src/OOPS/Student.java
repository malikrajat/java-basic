package OOPS;

public class Student extends Person{
    public  Student(String name, String sureName, int age) {
        super(name, sureName, age);
    }

    public static void run() {
        System.out.println("Student can run");
    }

    public String read(String bookName) {
        return  bookName;
    }
}
