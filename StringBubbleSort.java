package Bhargavi;

import java.util.Scanner;

public class StringBubbleSort {

	public static void main(String[] args) {
		String[] sc = {"navya","Bhargavi","Dhamu","amulu"};
		
		for (int i = 0; i < sc.length - 1; i++) {
            for (int j = 0; j < sc.length - i - 1; j++) {
                if (sc[j].compareToIgnoreCase(sc[j+1])>0) {
                    String temp = sc[j];
                    sc[j] = sc[j + 1];
                    sc[j + 1] = temp;
                }
            }
        }
		System.out.println("Sorted List:");
		for(String str:sc)
			System.out.println(str + " ");
		

}
}

