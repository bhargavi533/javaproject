package xyz;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;

class list1{
	 list1() {
		ArrayList<String> al= new ArrayList<String>();
		al.add("hello");
		al.add("hi");
		al.add("how");
		System.out.println(al);
	}
}
 class list2 extends list1{
	 list2() {
		LinkedList<String> al= new LinkedList<String>();
		al.add("keerthu");
		al.add("kittu");
		al.add("pandu");
		System.out.println(al);
	}
}
 class list3 extends list2{
	 list3() {
		HashSet<String> al= new HashSet<String>();
		al.add("surya");
		al.add("teja");
		al.add("dhamu");
		al.add("sudha");
		System.out.println(al);
	}
}
 class list4 extends list3{
	 list4() {
		HashMap<Integer,String> al= new HashMap<>();
		al.put(1,"bhar");
		al.put(1,"bhargavi");
		al.put(3,"bhagya");
		al.put(4,"hema");
		System.out.println(al);
	}
}
public class AllListEx {

	public static void main(String[] args) {
		
		list4 lh=new list4();

	}

}