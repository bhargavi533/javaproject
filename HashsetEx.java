package xyz;

import java.util.Scanner;
import java.util.HashSet;

public class HashsetEx{

    public static void main(String[] args) {
        HashSet<String> student = new HashSet<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 6 student names:");

        for (int i = 0; i < 6; i++) {
            String name = sc.nextLine();
            student.add(name);
        }

        System.out.println("Unique student names:");
        System.out.println(student);
        sc.close();
    }
}
