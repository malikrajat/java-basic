package generic;

import java.util.ArrayList;

public class GenericApp {
    public static void main(String[] args) {
        Box<Integer> myFavNumber = new Box<>();
        myFavNumber.setTypeData(35);
        Box<String> myFavActor = new Box<>();
        myFavActor.setTypeData("Sunny");

        Util.displayToString(myFavNumber);
        Util.displayToString(myFavActor);

        ArrayList<Box<String>> pileOfBoxes = new ArrayList<>();
        pileOfBoxes.add(myFavActor);
        pileOfBoxes.add(myFavActor);
        Util.displayToString(pileOfBoxes);

        OrderedPaire<Integer, String> kobe = new OrderedPaire<>(24, "Rajat");
        Util.displayToString(kobe);

        ArrayList<OrderedPaire<String, String>> list = new ArrayList<>();
        OrderedPaire<String, String> malik = new OrderedPaire<>("Rajat", "Malik");
        OrderedPaire<String, String> pinku = new OrderedPaire<>("pinku", "Malik");

        list.add(malik);
        list.add(pinku);
        Util.displayToString(list);



    }

}
