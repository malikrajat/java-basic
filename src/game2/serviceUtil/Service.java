package game2.serviceUtil;

import game2.main.Cities;
import game2.util.Util;

import java.util.LinkedList;

public class Service {
    public static void menu1(){
        String info = Util.fillUserInfo();
        System.out.println("Welcome.....");
        String city =  Util.enterString("Where do you want to go ?.");
        System.out.println(info);
        Cities cities = new Cities();
        LinkedList<String> list =cities.getCities();
        if(list.contains(city)){
            System.out.println("There are available trips for " + city + " .....");
            String tripInfo = Util.fillTripInfo();
            System.out.println(tripInfo);
        } else {
            System.out.println("There are no available trips\tHere are the active trips");
            for (String s: list) {
                System.out.println(s);
            }
        }
    }
    public static void menu2() {
        String info = Util.fillUserInfo();
        String carType = Util.enterString("Please enter your car type.");
        String placeTo = Util.enterString("Where do you ride?.");
        String placeFrom = Util.enterString("Your current location.");
        int capacity = Util.enterInteger("How many passanger you can carry ");
        String requires = Util.enterString("Enter Requires: For example (SMOCK-NO, PET-YES, LUGGAGE-NO)");
        System.out.println("Car type " + carType + " from" + placeFrom + " to " + " with " + capacity + " passanger with there requires" + requires);
    }
    public static void menu3() {
        System.out.println("We are happy to serve you the best!");
    }
}
