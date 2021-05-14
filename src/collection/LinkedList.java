package collection;

public class LinkedList<S> {
    public static void main(String[] args) {
        java.util.LinkedList<Integer> l1 = new java.util.LinkedList<>();
        java.util.LinkedList<Integer> l2 = new java.util.LinkedList<>();
        l2.add(12);
        l2.add(23);
        l2.add(34);
        l2.add(8);
        l1.add(8);
        l1.add(3);
        l1.add(1);
        l1.add(6);
        l1.addLast(12);
        l1.addFirst(3);
    }
}
