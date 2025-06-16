package kittu;

import java.util.Scanner;

public class LinearSearchInArray {
    public static int linearSearch(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target)
                return i;
        }
        return -1;  
    }

    public static void main(String[] args) {
        int[] arr = {12, 34, 45, 67, 89};
        try (var scanner = new Scanner(System.in)) {
			System.out.print("Enter element to search: ");
			int target = scanner.nextInt();
			int index = linearSearch(arr, target);
			System.out.println(index != -1 ? "Element found at index " + index : "Element not found.");
		}
    }
}