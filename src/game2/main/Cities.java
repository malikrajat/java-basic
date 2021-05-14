package game2.main;

import java.util.LinkedList;

public class Cities {
    LinkedList<String> list = new LinkedList<>();

    public Cities() {}

    public LinkedList<String> getCities() {
        list.add("Delhi");
        list.add("Noida");
        list.add("Gurgav");
        list.add("Gzagiyabd");
        list.add("meerit");
        list.add("Shamli");
        list.add("Muzaffaranager");
        return list;
    }
}
