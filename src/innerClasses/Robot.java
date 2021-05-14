package innerClasses;

public class Robot {
    private int id;
    public class Brain {
        public void think() {
            System.out.println("Robot " + id + " is thinking");
        }
    }
    public static class Battery {
        public void charger(){
            System.out.println("Battery charging...");
        }
    }

    public Robot(int id) {
        this.id = id;
    }
    public void start (){
        System.out.println("Starting Robot " + id);
        Brain brain = new Brain();
        brain.think();
        String name = "Robot";

        class Temp {
            public void doSomething() {
                System.out.println("ID is " + id);
                System.out.println("My Name is " + name);
            }
        }
        Temp temp = new Temp();
        temp.doSomething();
    }
}
