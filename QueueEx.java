package xyz;

import java.util.LinkedList;
import java.util.Queue;

public class QueueEx {

	public static void main(String[] args) {
		Queue <String> icecream= new LinkedList<String>();
		icecream.add("kid 1");
		icecream.add("kid 2");
		icecream.add("kid 3");
		icecream.add("kid 4");
		icecream.add("kid 5");
		
		System.out.println(icecream);
		String firstIn=icecream.peek();
		System.out.println(firstIn);
		String firstOut=icecream.poll();
		System.out.println(firstOut);
		System.out.println(icecream);
		
		
	}

}
