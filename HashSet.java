package xyz;

import java.util.Scanner;
import java.util.HashSet;

public class HashSet{

	public static void main(String[] args) {
		
		HashSet<String> student=new HashSet();
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the names:");
		 for (int i=0;i<=5;i++){
			 String name= sc.nextLine();
			 student.add(name);
		 }
		 System.out.println(student);

	}

}