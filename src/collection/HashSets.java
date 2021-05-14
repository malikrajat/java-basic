package collection;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Set;

public class HashSets {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();
        set.add("One");
        set.add("Two");
        set.add("Three");
        for (String ss: set) {
            System.out.println(ss);
        }
    }

}
