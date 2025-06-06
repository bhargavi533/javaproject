package xyz;

import java.util.TreeSet;

public class TreeSetTask2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     TreeSet<String> empolyee=new TreeSet<>();
     empolyee.add("Sumit");
     empolyee.add("Karan");
     empolyee.add("Anjali");
     empolyee.add("Mohan");
     empolyee.add("Zoya");
     System.out.println(empolyee);
    // for(int i=0;i<empolyee.size();i++) {
    	 //String employee1= new StringBuilder().reverse().toString();
    	// System.out.println(employee1);
    // }
     System.out.println(empolyee.reversed());
	}

}