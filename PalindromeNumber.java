
package xyz;
import java.util.Scanner;

public class PalindromeNumber {

    public static void main(String[] args) {
    	Scanner sc=new Scanner(System.in);
    	
        int n = sc.nextInt(); 
        int original = n;
        int rem;
        int reverse = 0;

        while (n != 0) {
            rem = n % 10; 
            reverse = reverse * 10 + rem;
            n = n / 10; 
        }

        if (original == reverse) {
            System.out.println(original + " is a palindrome.");
        } else {
            System.out.println(original + " is not a palindrome.");
        }
    }
}
