package Bhargavi;
import java.util.Scanner;

public class MaxNumberFromUser {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[5];  // Array to store 5 numbers

        System.out.println("Enter 5 numbers:");

        // Take input from user
        for (int i = 0; i < 5; i++) {
            System.out.print("Number " + (i + 1) + ": ");
            numbers[i] = scanner.nextInt();
        }

        // Find maximum number
        int max = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > max) {
                max = numbers[i];
            }
        }

        System.out.println("Maximum number is: " + max);
        
        scanner.close();
    }
}
