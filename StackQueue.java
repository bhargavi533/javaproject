package xyz;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class StackQueue {

    public static void main(String[] args) {
        Stack<String> toys = new Stack<String>();
        Queue<String> icecream = new LinkedList<String>();

        toys.push("Ball");
        toys.push("Blocks");
        toys.push("Puzzle"); 

        System.out.println("Top Toy is " + toys.peek());
        System.out.println("Toy is Being " + toys.pop());

        
        icecream.add("Maya");
        icecream.add("Leo");
        icecream.add("Nina");
        System.out.println(icecream);

        String firstOut = icecream.poll(); 
        System.out.println(firstOut);
        System.out.println(icecream);
    }
}
