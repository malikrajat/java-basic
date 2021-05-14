package generic;

import generic.person.People;

public class Test {

//    public static <T> void print(T[] args) {
//        for(T i: args) {
//            System.out.println(i);
//        }
//
//    }
public <T> void verify(T people) {
    System.out.println("This is a people - " + people);
}
}
