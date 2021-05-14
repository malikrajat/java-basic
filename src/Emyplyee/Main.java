package Emyplyee;

public class Main {
    public static void main(String[] args) {
        Programmer programmer = new Programmer("Rajat", "Er.", 29, "Java");
        programmer.showInfo();
        programmer.work();
        CEO ceo = new CEO("Rajat", "Er.", 29, 18);
        ceo.showInfo();
        ceo.work();
    }
}
