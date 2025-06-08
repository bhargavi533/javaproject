package Bhargavi;

import java.util.HashMap;

public class HashMapGroceryStore {

	public static void main(String[] args) {
		HashMap<Integer, String> GroceryStore=new HashMap<>();
		GroceryStore.put(40,"milk");
		GroceryStore.put(10,"lolipop");
		GroceryStore.put(50,"teapowder");
		GroceryStore.put(60,"Apples");
		GroceryStore.put(70,"bananas");
		System.out.println(GroceryStore);
		int sum = 0;
		for (int cost : GroceryStore.keySet()) {
            sum += cost;
        }
        System.out.println(sum);
        GroceryStore.put(100,"Apples");
        System.out.println(GroceryStore);
        GroceryStore.remove(10,"lolipop");
        System.out.println(GroceryStore);
        
        
		

	}

}
