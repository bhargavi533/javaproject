package xyz;

import java.util.Stack;

public class StcackEx {

	public static void main(String[] args) {
		Stack<String> s=new Stack<String>();
		s.push("Plate 1");
		s.push("Plate 2");
		s.push("Plate 3");
		s.push("Plate 4");
		s.push("Plate 5");
		System.out.println("Top plate is "+ s.peek());
		
		System.out.println("served"+ s.pop());
		
		if(s.isEmpty()) {
			System.out.println("how many plates are left");
		}
		

	}

}
