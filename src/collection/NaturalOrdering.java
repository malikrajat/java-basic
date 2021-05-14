package collection;

import javax.xml.namespace.QName;
import java.util.*;

class Persons implements Comparable<Persons>{
    private String name;

    public Persons(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Persons persons = (Persons) o;
        return name.equals(persons.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

    @Override
    public int compareTo(Persons persons) {
//        return -name.compareTo(persons.name);
        int leng1 = name.length();
        int leng2 = persons.name.length();
        if (leng1 > leng1) {
            return 1;
        } else if (leng1 < leng2) {
            return  -1;
        } else {
            return name.compareTo(persons.name);
        }
//        return 0;
    }
}

public class NaturalOrdering {
    public static void main(String[] args) {
        List<Persons> list1 = new ArrayList<Persons>();
        SortedSet<Persons> set1 = new TreeSet<Persons>();

        addElement1(list1);
        addElement1(set1);

        Collections.sort(list1);


        showElement1(list1);
        System.out.println("");
        showElement1(set1);


        List<String> list = new ArrayList<String>();
        SortedSet<String> set = new TreeSet<String>();




        addElement(list);
        addElement(set);

        Collections.sort(list);


        showElement(list);
        System.out.println("");
        showElement(set);

    }

    public static void addElement(Collection<String> col) {
        col.add("Joe");
        col.add("sue");
        col.add("juliet");
        col.add("Clare");
        col.add("Mike");
    }

    public static void showElement(Collection<String> col) {
        for (String element: col) {
            System.out.println(element);
        }
    }

    public static void addElement1(Collection<Persons> col) {
        col.add(new Persons("Joe"));
        col.add(new Persons("sue"));
        col.add(new Persons("juliet"));
        col.add(new Persons("Clare"));
        col.add(new Persons("Mike"));
    }

    public static void showElement1(Collection<Persons> col) {
        for (Persons element: col) {
            System.out.println(element);
        }
    }
}
