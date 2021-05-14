package collection;
import java.util.Iterator;
import java.util.LinkedList;

public class Iterators {
    public static void main(String[] args) {
        LinkedList<String> animals = new LinkedList<String>();
        animals.add("Fox");
        animals.add("dog");
        animals.add("rabbit");

        Iterator<String> it =  animals.iterator();

        while (it.hasNext()) {
            String value = it.next();
            System.out.println(value);
            if (value.equals("cat")) {
                it.remove();
            }
        }
            System.out.println();


        for (String animal: animals) {
            System.out.println(animal);
        }
    }
}
