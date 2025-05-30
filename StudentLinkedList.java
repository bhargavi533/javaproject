package xyz;

import java.util.LinkedList;
public class StudentLinkedList {

	public static void main(String[] args) {
		LinkedList<String> studnts = new LinkedList<String>();
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter Names of 5 students");
		
		for(i=0;i<5;i++) {
			System.out.println("Enter name of stufents"+i+":");
			String name=sc.nextLine();
			students.add(name);
		}
		System.out.println("students name are:");
		for(String student:students) {
			System.out.println(students);
		}
		sc.close();
		
	}
}	