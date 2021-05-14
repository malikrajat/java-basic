package collection;

import java.util.*;

class StringLengthComparator implements Comparator<String>{

    @Override
    public int compare(String s1, String s2) {
        int leng1 = s1.length();
        int leng2 = s2.length();
        if(leng1> leng2) {
            return 1;
        } else if (leng1 < leng2) {
            return -1;
        }
        return 0;
    }
}

class AlphabeticComparator implements Comparator<String>{

    @Override
    public int compare(String s1, String s2) {
        return s1.compareTo(s2);
    }
}

class ReversAlphabeticComparator implements Comparator<String>{

    @Override
    public int compare(String s1, String s2) {
        return -s1.compareTo(s2);
    }
}

class Person {
    private int id;
    private String name;

    public Person(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return id  + " : " +  name;
    }
}

public class SortingList {
    public static void main(String[] args) {
        List<String> animals = new ArrayList<String>();
        animals.add("tiger");
        animals.add("lion");
        animals.add("cat");
        animals.add("snake");
        animals.add("mongoose");
        animals.add("elephant");


        Collections.sort(animals, new StringLengthComparator());

        for (String animal: animals) {
            System.out.println(animal);
        }

        List<Integer> numbers = new ArrayList<Integer>();
        numbers.add(12);
        numbers.add(21);
        numbers.add(10);
        numbers.add(2);
        numbers.add(4);

        Collections.sort(numbers, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return -o1.compareTo(o2);
            }
        });

        for (Integer num: numbers) {
            System.out.println(num);
        }


        List<Person> people = new ArrayList<Person>();
        people.add(new Person(1, "Rajat"));
        people.add(new Person(3, "malik"));
        people.add(new Person(2, "pinku"));

        Collections.sort(people, new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                if(o1.getId() > o2.getId()) {
                    return 1;
                } else if (o1.getId() < o2.getId()) {
                    return -1;
                }
                return 0;
            }
        });

        Collections.sort(people, new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                return o1.getName().compareTo(o2.getName());
            }
        });

        for (Person person: people) {
            System.out.println(person);
        }

    }
}
