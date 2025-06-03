package xyz;

import java.util.Scanner;

public class Calender {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String Day=sc.nextLine().toLowerCase();
		switch (Day) {
		case "monday":
			System.out.println("Lets Learn Python");
			break;
		case "tueday":
			System.out.println("Lets Learn java");
			break;
		
		case "wednesday":
			System.out.println("Lets Learn Anguler Js");
			break;
		
		case "thursday":
			System.out.println("Lets Learn Ruby");
			break;
		
		case "friday":
			System.out.println("Lets Learn C++");
			break;
		
		case "saturday":
			System.out.println("Lets Learn C");
			break;
		
		case "sunday":
			System.out.println("Lets Learn R");
			break;
			
		default:
			System.out.println("choose correct option");
			break;
		}
		sc.close();

	}

}
