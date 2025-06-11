package Bhargavi;

public class LinearTimeExample {

    public static void print(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Element:" + i + " : " + arr[i]);
        }
    }

    public static void main(String[] args) {
        int num[] = {5, 9, 6, 3, 4, 2, 1, 8};
        print(num);
    }
}
