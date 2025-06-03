package xyz;

import java.util.Map;
import java.util.TreeMap;

public class Treemap {

    public static void main(String[] args) {
        TreeMap<Integer, String> tm = new TreeMap<>();
        System.out.println("Students marks");
        tm.put(100, "amar");
        tm.put(50, "Deep");
        tm.put(76, "naveen");
        tm.put(88, "mema");

        System.out.println(tm);

        for (Map.Entry<Integer, String> entry : tm.entrySet()) {
            if (entry.getValue().equals("mema")) {
                System.out.println("Found mema with marks: " + entry.getKey());
            }
        }
        TreeMap<Long, String> PhoneBook = new TreeMap<>();
        System.out.println("phoneBook");
        PhoneBook.put((long) 1001232, "amardeep");
        PhoneBook.put((long) 5021325, "Divya");
        PhoneBook.put((long) 7623423, "naya");
        PhoneBook.put((long)8823423, "naveen");
        System.out.println(PhoneBook);
    }
}
