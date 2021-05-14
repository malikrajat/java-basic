package game1;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to  Bulls and Cows game!");
        System.out.println("This is a logical game" +
                "\n Here B means, your guess number is inside the hidden number and right place" +
                "\n Here C means one of your number is inside hidden number but in the wrong place");
        Random random = new Random();
        int intRandom = random.nextInt(99);
        System.out.println("this is a int value " + intRandom);
        while (intRandom < 11) {
            intRandom++;
        }
        String s =  String.valueOf(intRandom);
        char charRandom = s.charAt(0);
        char charRandom2 = s.charAt(1);
        while (true) {
            if (charRandom == charRandom2){
                charRandom++;
            }
            String strRandom =  scanner.nextLine();

            int input = Integer.parseInt(strRandom);
            if (input <10) {
                continue;
            }
            char charInput = strRandom.charAt(0);
            char charInput2 = strRandom.charAt(1);

            if (input == intRandom) {
                System.out.println("Cong...........");
                return;
            } else if (charInput == charInput || charRandom2 == charInput2) {
                System.out.println("IB 0C");
            } else if (charRandom == charInput2 && charRandom2 == charInput) {
                System.out.println("0B 2C");
            } else if (charRandom == charInput2 || charRandom2 == charInput) {
                System.out.println("0B 1C");
            } else {
                System.out.println("0B 0C");
            }

        }
    }
}
