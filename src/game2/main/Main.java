package game2.main;

import game2.serviceUtil.Service;
import game2.util.Util;

import java.util.LinkedList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        String nationality = Util.enterString("Please tell us, Are you a foreign or native");
        System.out.println("Welcome to Bla Bla car Application\n\t Your ride your choice");
        Scanner scanner = new Scanner(System.in);
        String services = "1 - Find Ride \n" +
                "2 - Offer Ride \n" +
                "3 - About Us \n" +
                "0 - Quit \n";
        System.out.println(services);
        while (true) {


            String information = "";
            if (nationality.equalsIgnoreCase("foreign")) {
                information = Util.enterString("Enter Passport number");
                System.out.println("Checking info for " + information);
                Thread.sleep(2000);
                System.out.println("Process completed Successfully.");
            } else if (nationality.equalsIgnoreCase("native")) {

            } else {
                System.out.println("Invalid operation");
                break;
            }
            int menu = scanner.nextInt();
            if (menu == 1) {
                Service.menu1();
                break;
            } else if (menu == 2) {
                Service.menu2();
            } else if (menu == 3) {
                Service.menu3();
            } else if (menu == 0) {
                System.out.println("Quiting from application.");
                break;
            } else {
                System.out.println("Invalid Operation");
                continue;
            }
        }
    }
}
