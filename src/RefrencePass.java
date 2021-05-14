public class RefrencePass {
    public static void main(String[] args) {
        int [] x = {90, 91,92,93,94,95};
        change(x);
        System.out.println(x[0]);
    }

    public static void change(int [] a) {
        a[0] = 20;
//        System.out.println(a);
    }
}
