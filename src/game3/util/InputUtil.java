package game3.util;

import game3.main.Student;

import java.util.Scanner;

public class InputUtil {
    public static int enterInteger(String title) {
        System.out.println(title);
        Scanner scanner = new Scanner(System.in);
        int operator = scanner.nextInt();
        return operator;
    }
    public static String enterString(String title) {
        System.out.println(title);
        Scanner scanner = new Scanner(System.in);
        String answer = scanner.nextLine();
        return answer;
    }

    public static void main(String[] args) {
//        enterInteger("How old are you?.");
    }
    public static Student fill () {
        String name = InputUtil.enterString("Enter Student Name");
        String surname = InputUtil.enterString("Enter Student surname");
        int age = InputUtil.enterInteger("Enter Student age");
        String className = InputUtil.enterString("Enter Student Class Name");
        return new Student(name, surname, age, className);
    }
}
