package xyz;

import java.util.HashMap;

public class TreeMapTask1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      HashMap<String, String> country=new HashMap<>();
      country.put("india", "newdelhi");
      country.put("usa", "washington");
      country.put("germany", "berlin");
      country.put("japan", "tokyo");
      country.put("india", "delhi");
      System.out.println(country);
	}

}