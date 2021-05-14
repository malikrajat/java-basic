package game3.util;

import game3.main.Configuration;
import game3.main.Student;

public class MenuUtil {
    public static void printAllStudent() {
        if(Configuration.student == null) {
            System.out.println(" You do not have any student");
            return;
        }
        System.out.println("Student that you have register");
        for (int i = 0; i< Configuration.student.length; i++) {
            Student st = Configuration.student[i];
            System.out.println((i+1) + ". Student \n" + st.getInfo());
        }
    }
    public static void registerStudent() {
        int count = InputUtil.enterInteger("How many student you want to register");

        Configuration.student = new Student[count];
        for (int i=0; i< count; i++){
            System.out.println((i +1) + ". Registration");
            Student st =  InputUtil.fill();
            Configuration.student[i] = st;
        }
    }

    public static void findStudent() {
        String find = InputUtil.enterString("Enter student name or surname");
        for (int i = 0; i< Configuration.student.length; i++) {
            Student st = Configuration.student[i];
            if(st.getName().equalsIgnoreCase(find) || st.getSurname().equalsIgnoreCase(find)){
                System.out.println(st.getInfo());
            }
        }
    }
    public static void updateStudent() {
        int student_place = InputUtil.enterInteger("In which student you want to update");
        System.out.println("Enter new information");
        Student st = InputUtil.fill();
        Configuration.student[student_place] = st;
    }
}
