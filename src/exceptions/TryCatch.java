package exceptions;

public class TryCatch {
    public static void main(String[] args) {
        int a[] = {1,2,3,4,5,6,7,8,9,10};
        try {
            System.out.println(a[11]);
        } catch (ArithmeticException e) {
//            e.printStackTrace();
            System.out.println("Arithmetic exception");
        } catch (NullPointerException e) {
            System.out.println("null pointer exception");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Invalid array index");
        }
    }
}
