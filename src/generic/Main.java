package generic;

import generic.person.People;
import generic.person.Student;
import generic.person.Teacher;

public class Main {
    public static void main(String[] args) {
//        Integer arr[] = {1,2,3,4,5,6,7,8,9};
//       Test.print(arr);
//       String arr1[] = {"a","s","d","f","g"};
//       Test.print(arr1);
//       Double arr2[] = {1.2,1.3,1.5,1.6,1.7,1.9};
//       Test.print(arr2);

        Test test = new Test();
        Student student = new Student("Chinu");
        Teacher teacher = new Teacher("Pinku");
        People people = new People("Rajat","malik");
        test.verify(people);
        test.verify(teacher);
        test.verify(student);
    }
}
