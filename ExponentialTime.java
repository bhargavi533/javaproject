package Bhargavi;

public class ExponentialTime {
	
	public static int fibonnacci(int n) {
		if(n<=1) {
			return n;
		}
		return fibonnacci(n-1)+fibonnacci(n-2);
		
	}

	public static void main(String[] args) {
		int n=5;
		System.out.println("Fibonacci of "+n+"is:"+fibonnacci(n));
	}

}
