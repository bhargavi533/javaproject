package Bhargavi;

import java.util.Stack;

public class StackAction {

	public static void main(String[] args) {
		Stack <String> action=new Stack <String>();
		action.push("write");
		action.push("delete");
		action.push("update");
		System.out.println(action);
		String lastIn=action.peek();
		System.out.println(lastIn);
		String firstOut=action.pop();
		System.out.println(firstOut);
		String firstOut1=action.pop();
		System.out.println(firstOut1);
		System.out.println(action);
		
		

		
	}
}