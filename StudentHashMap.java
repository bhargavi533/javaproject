package xyz;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class StudentHashMap {
    public static void main(String[] args) {
        HashMap<Integer, String> studentMap = new HashMap<>();

        studentMap.put(101, "Alice");
        studentMap.put(102, "Bob");
        studentMap.put(103, "Charlie");
        studentMap.put(104, "Diana");
        studentMap.put(105, "Ethan");

        studentMap.remove(103);
        System.out.println("Removed student with roll number 103.");

        studentMap.put(104, "Danielle");
        System.out.println("Updated roll 104 to 'Danielle'.");

        System.out.println("Contains roll number 102? " + studentMap.containsKey(102));
        System.out.println("Contains student named 'Ethan'? " + studentMap.containsValue("Ethan"));

        System.out.println("\n--- Student Records ---");
        for (Map.Entry<Integer, String> entry : studentMap.entrySet()) {
            System.out.println("Roll No: " + entry.getKey() + ", Name: " + entry.getValue());
        }

        comparePerformance();
    }

    public static void comparePerformance() {
        System.out.println("\n--- Performance Comparison ---");
        final int entries = 1_000_000;
        long start, end;

        HashMap<Integer, String> hashMap = new HashMap<>();
        start = System.nanoTime();
        for (int i = 0; i < entries; i++) {
            hashMap.put(i, "Student" + i);
        }
        end = System.nanoTime();
        System.out.println("HashMap insertion time: " + (end - start) / 1_000_000 + " ms");

        TreeMap<Integer, String> treeMap = new TreeMap<>();
        start = System.nanoTime();
        for (int i = 0; i < entries; i++) {
            treeMap.put(i, "Student" + i);
        }
        end = System.nanoTime();
        System.out.println("TreeMap insertion time: " + (end - start) / 1_000_000 + " ms");
    }
}
