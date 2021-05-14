package collection;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class ArrayLists {
    public static void main(String[] args) {
//        List<String> list = new ArrayList<>();

//        List<String> list = new LinkedList<>();
//        list.add("A");
//        list.add("B");
//        list.add("C");
//        list.add(1,"Z");
//
//        ListIterator<String> iterator = list.listIterator();
//        while (iterator.hasNext()){
//            System.out.println(iterator.next());
//        }

//        for(String a: list) {
//            System.out.println(a);
//        }
        run();
    }


        public static void run() {
            ArrayList<Integer> l1 = new ArrayList<Integer>();
            ArrayList<Integer> l2 = new ArrayList<Integer>(5);
            l1.add(6);
            l2.add(12);
            l1.add(1);
            l2.add(23);
            l2.add(34);
            l2.add(8);
            l1.add(8);
            l1.addAll(l2);
            l1.add(3);
            l1.set(2, 234);
            l1.add(0,10);
    //        l1.clear();
    //        System.out.println(l1.contains(12));
            System.out.println(l1.indexOf(12));
            System.out.println(l1.indexOf(120));
            for (int val: l1) {
                System.out.print(val);
                System.out.print(", ");
            }
    //        for (int i =0; i < l1.size(); i++) {
    //            System.out.println(l1.get(i));
    //        }
        }
    }
