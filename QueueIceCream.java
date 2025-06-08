package Bhargavi;

import java.util.LinkedList;
import java.util.Queue;

public class QueueIceCream {

	public static void main(String[] args) {
		Queue<String> IceCream=new LinkedList<String>();
		IceCream.add("kid 1");
		IceCream.add("kid 2");
		IceCream.add("kid 3");
		IceCream.add("kid 4");
		IceCream.add("kid 5");
		System.out.println(IceCream);
		String firstIn=IceCream.peek();
		System.out.println(firstIn);
		String firstOut=IceCream.poll();
		System.out.println(firstOut);
		System.out.println(IceCream);
		IceCream.add("kid 6");
		System.out.println(IceCream);
		

	}

}
