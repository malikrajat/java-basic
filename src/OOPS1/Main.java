package OOPS1;

public class Main {
    public static void main(String[] args) {
        GameDeveloper game = new GameDeveloper("Rajat", "Er.", "Java", 28);
        FrontEndDeveloper front = new FrontEndDeveloper("Malik", "Dr.", "JavaScript", 28);
        game.comeEarly();
        game.testCode();
        game.writeCode();
        System.out.println("**********************************************************");
        front.comeEarly();
        front.testCode();
        front.writeCode();


    }
}
