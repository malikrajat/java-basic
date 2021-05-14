package Abstract;

public class Main {
    public static void main(String[] args) {
    Person person = new Person();
    person.increment();
    String s = person.sayName();
        System.out.println(s);
    }
}
