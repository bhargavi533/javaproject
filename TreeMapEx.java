package xyz;

import java.util.TreeMap;

public class TreeMapEx {

    public static void main(String[] args) {
        TreeMap<Integer, String> tm = new TreeMap<>();
        tm.put(3306, "Bhagya");
        tm.put(3308, "Bhargavi");
        tm.put(3313, "Deepa");
        tm.put(3337, "Mahathi");

        System.out.println(tm);
    }
}
