package kittu;

import java.util.Scanner;

public class BinarySearchInArray {
    public static int binarySearch(int[] arr, int target) {
        int left = 0, right = arr.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (arr[mid] == target)
                return mid;
            else if (arr[mid] < target)
                left = mid + 1;
            else
                right = mid - 1;
        }
        return -1;  
    }

    public static void main(String[] args) {
        int[] arr = {1, 3, 5, 7, 9, 11};
        try (var scanner = new Scanner(System.in)) {
			System.out.print("Enter element to search: ");
			int target = scanner.nextInt();
			int index = binarySearch(arr, target);
			System.out.println(index != -1 ? "Element found at index " + index : "Element not found.");
		}
    }
}