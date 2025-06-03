package xyz;

import java.util.Scanner;

public class IfElse {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Is it raining? (true/false): ");
		boolean isRaining = sc.nextBoolean();  
		if (isRaining) {
			System.out.println("Take an umbrella");
		} else {
			System.out.println("No need of an umbrella");
		}

		sc.close(); 
	}
}
