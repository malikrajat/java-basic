package game3.main;

import game3.util.InputUtil;
import game3.util.MenuUtil;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome to the school Operation Center");
        while (true) {
            int operation = InputUtil.enterInteger("What do you want to do?." +
                    "\n1: Register student" +
                    "\n2: Show all the student" +
                    "\n3: Find student" +
                    "\n4: Update student" +
                    "\n0: To Quit");
            if (operation == 1) {
                MenuUtil.registerStudent();
            } else if (operation == 2) {
                MenuUtil.printAllStudent();
            } else if(operation == 3) {
                MenuUtil.findStudent();
            } else if(operation == 4) {
                MenuUtil.updateStudent();
            } else if(operation == 0){
                System.out.println("Quiting from application");
                break;
            }else {
                System.out.println("Invalid operation");
                break;
            }
        }

    }
}
