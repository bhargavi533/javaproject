package xyz;

import java.util.ArrayList;

public class ArrayListExample {

	public static void main(String[] args) {
		ArrayList <String>cities=new ArrayList <String>();
		cities.add("mumbai");
		cities.add("kerala");
		cities.add("Delhi");
		cities.add("manali");
		cities.add("mysur");
		System.out.println(cities);
		System.out.println(cities.get(0));
		cities.set(0, "chennai");
		System.out.println(cities);
		cities.remove(2);
		System.out.println(cities);
		String original = "[mumbai,kerala,Delhi,manali]";
		String reversed = new StringBuilder(original).reverse().toString();
		System.out.println(original);
		System.out.println(reversed);
		cities.set(2, "kerala" );
		System.out.println(cities);
	}
}
