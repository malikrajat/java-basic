public class Demo {
    public static void main(String[] args) {
//        System.out.println("Hello Rajat, Java is very east to learn and you did it very easily");
        byte age = 12; // 1 byte
        boolean yes = true; // 1 byte

        char latter = 'a'; // 2 byte // it is in single quote either string if you pass number, It will print it's respective char letter
        short lessCount = 1234; // 2 byte

        int count = 123456; // 4 byte
        float number = 5.5F; // 4 byte

        double biggestNumber = 56; // it can both int or float  // 8 byte
        String name = "Java is very to work on"; // 8 byte
        long bigCount = 9876454321L; // 8 byte

        System.out.println(count);
    }
    public static void greeting() {
        System.out.println("Hello Rajat, this is function calling");
    }

    public static int divide(int a, int b) {
        return a/b;
//        System.out.println(a/b);
    }

    public static int divideTwo() {
        return  divide(10, 20)/ 2;
    }
}
