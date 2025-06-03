package xyz;

import java.util.LinkedList;
import java.util.Scanner;

public class ForLoopEx {

	public static void main(String[] args) {
		LinkedList<String> students = new LinkedList<String>();
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter names of 5 students");
		
		for(int i=0;i<5;i++) {
			System.out.println("Enter name of stufents"+i+":");
			String name=sc.nextLine();
			students.add(name);
		}
		System.out.println("students name are:");
		for(String student:students) {
			System.out.println(student);
		}
		sc.close();
		
	}
}	
