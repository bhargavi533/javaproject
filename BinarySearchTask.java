package xyz;

import java.util.ArrayList;
import java.util.Scanner;

public class BinarySearchTask {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       ArrayList<String> name=new ArrayList<>();
       name.add("bhargavi");
       name.add("bhagya");
       name.add("sandy");
       int n=name.size();
       int start=0;
       int end=n-1;
       boolean found=false;
       try (Scanner sc = new Scanner(System.in)) {
		String tag=sc.nextLine();
		   while(start<end) {
			   int mid=(start+end)/2;
			   if(name.contains(tag)) {
				   System.out.println("found");
				   found=true;
				   break;
			   }else if(end<name.indexOf(tag)) {
				  end=mid-1; 
			   }else {
				   start=mid+1;
			   }
		   }
	}
       if(!found) {
      System.out.println("not found"); 
	}
	}

}