package xyz;

import java.util.HashSet;
import java.util.ArrayList;
import java.util.Iterator;

public class HashSetExample {

    public static void main(String[] args) {
        HashSet<String> names = new HashSet<>();

        names.add("Alice");
        names.add("Bob");
        names.add("Charlie");
        names.add("Alice");
        names.add("Bob");

        System.out.println("HashSet contents: " + names);

        String checkName = "Charlie";
        if (names.contains(checkName)) {
            System.out.println(checkName + " exists in the HashSet.");
        } else {
            System.out.println(checkName + " does not exist in the HashSet.");
        }

        ArrayList<String> namesList = new ArrayList<>(names);
        System.out.println("Converted ArrayList: " + namesList);

        System.out.println("Iterating through HashSet using Iterator:");
        Iterator<String> iterator = names.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
