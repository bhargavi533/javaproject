package xyz;

import java.util.ArrayList;
import java.util.Collections;

public class CityList {

    public static void main(String[] args) {
        ArrayList<String> cities = new ArrayList<String>();
        cities.add("mumbai");
        cities.add("kerala");
        cities.add("Delhi");
        cities.add("manali");
        cities.add("mysur");

        System.out.println("Original list: " + cities);

       
        System.out.println("First city: " + cities.get(0));
        cities.set(0, "chennai");
        System.out.println("After replacing first city: " + cities);

       
        cities.remove(2);
        System.out.println("After removing index 2: " + cities);

        
        Collections.reverse(cities);
        System.out.println("Reversed list: " + cities);

        
        cities.set(2, "kerala");
        System.out.println("After setting index 2 to 'kerala': " + cities);

        
        Collections.sort(cities);
        System.out.println("Sorted list: " + cities);

        
        String searchCity = "kerala";
        if (cities.contains(searchCity)) {
            System.out.println(searchCity + " exists in the list at index: " + cities.indexOf(searchCity));
        } else {
            System.out.println(searchCity + " does not exist in the list.");
        }
    }
}
