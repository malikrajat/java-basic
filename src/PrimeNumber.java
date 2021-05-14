import java.util.Scanner;

public class PrimeNumber {

    public void prime(int counter){
        for (int i=2; i< counter; i++) {
            if(i%2 != 0) {
                System.out.println(i);
            }
        }
    }

    public static void main(String[] args) {
        System.out.println("Please enter number");
        Scanner count = new Scanner(System.in);
        PrimeNumber obj = new PrimeNumber();
        obj.prime(count.nextInt());
//        prime(count.nextInt());
    }

}
