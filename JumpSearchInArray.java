package kittu;

import java.util.Scanner;

public class JumpSearchInArray {
    public static int jumpSearch(int[] arr, int target) {
        int n = arr.length;
        int step = (int) Math.sqrt(n);
        int prev = 0;

        while (arr[Math.min(step, n) - 1] < target) {
            prev = step;
            step += (int) Math.sqrt(n);
            if (prev >= n)
                return -1;
        }

        for (int i = prev; i < Math.min(step, n); i++) {
            if (arr[i] == target)
                return i;
        }
        return -1; 
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 4, 8, 16, 32, 64, 128};
        try (Scanner scanner = new Scanner(System.in)) {
			System.out.print("Enter element to search: ");
			int target = scanner.nextInt();
			int index = jumpSearch(arr, target);
			System.out.println(index != -1 ? "Element found at index " + index : "Element not found.");
		}
    }
}