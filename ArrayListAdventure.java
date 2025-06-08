package Bhargavi;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListAdventure {

	public static void main(String[] args) {
		ArrayList<String> cartoon=new ArrayList<String>();
		cartoon.add("doremon");
		cartoon.add("shinchan");
		cartoon.add("oggy");
		cartoon.add("bheem");
		cartoon.add("tom");
		System.out.println(cartoon);
		cartoon.remove("doremon");
		System.out.println(cartoon);
		cartoon.set(3, "jerry");
		System.out.println(cartoon);
		for (int i = 0; i < cartoon.size(); i++) {
		    System.out.println(cartoon.get(i));
		}
		 Collections.sort(cartoon);

	        
	        System.out.println("Cartoon characters in alphabetical order:");
	        for (String name : cartoon) {
	            System.out.println(name);
	        }
		
	}

}