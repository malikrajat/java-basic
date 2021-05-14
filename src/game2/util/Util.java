package game2.util;

import java.util.Scanner;

public class Util {
    public static String enterString(String title) {
        System.out.println(title);
        Scanner scanner = new Scanner(System.in);
        String answer = scanner.nextLine();
        return answer;
    }
    public static int enterInteger(String title) {
        System.out.println(title);
        Scanner scanner = new Scanner(System.in);
        int answer = scanner.nextInt();
        return answer;
    }
    public static String fillUserInfo() {
        String nameSurname =  enterString("Enter Your Name & Surname");
        String email =  enterString("Enter your email");
        String mobile =  enterString("Enter your mobile number");
        return "Name : " + nameSurname + ", Email : " + email + ", Mobile : " + mobile;
    }
    public static String fillTripInfo(){
        String location =  enterString("Your current location");
        int passengers = enterInteger("How many passenger will travel?.");
        String requires = enterString("Enter Requires: For example (SMOCK-NO, PET-YES, LUGGAGE-NO)");
        String time = enterString("Enter Time");
        return "Your destination from " + location + " with " + passengers + " passengers and with these requires " + requires  + " in " + time;
    }
}
