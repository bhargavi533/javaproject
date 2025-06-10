package com.bhargavi;
import java.util.*;

public class SocialGraph {

   
    private Map<String, List<String>> graph = new HashMap<>();

    public void addConnection(String person1, String person2) {
        graph.putIfAbsent(person1, new ArrayList<>());
        graph.putIfAbsent(person2, new ArrayList<>());
        graph.get(person1).add(person2);
        graph.get(person2).add(person1);
    }

    
    public List<String> findSocialCircle(String person) {
        Set<String> visited = new HashSet<>();
        List<String> result = new ArrayList<>();
        dfsRecursive(person, visited, result);
        return result;
    }

    private void dfsRecursive(String person, Set<String> visited, List<String> result) {
        if (!graph.containsKey(person) || visited.contains(person)) return;
        visited.add(person);
        result.add(person);
        for (String neighbor : graph.get(person)) {
            dfsRecursive(neighbor, visited, result);
        }
    }

    
    public List<String> findSocialCircleIterative(String person) {
        Set<String> visited = new HashSet<>();
        List<String> result = new ArrayList<>();
        if (!graph.containsKey(person)) return result;

        Stack<String> stack = new Stack<>();
        stack.push(person);

        while (!stack.isEmpty()) {
            String current = stack.pop();
            if (!visited.contains(current)) {
                visited.add(current);
                result.add(current);
                for (String neighbor : graph.get(current)) {
                    if (!visited.contains(neighbor)) {
                        stack.push(neighbor);
                    }
                }
            }
        }

        return result;
    }

   
    public void printGraph() {
        for (String person : graph.keySet()) {
            System.out.println(person + " -> " + graph.get(person));
        }
    }

    public static void main(String[] args) {
        SocialGraph sg = new SocialGraph();

        sg.addConnection("Alice", "Bob");
        sg.addConnection("Bob", "Charlie");
        sg.addConnection("David", "Eve");

        System.out.println("Recursive DFS (Alice): " + sg.findSocialCircle("Alice"));
        System.out.println("Iterative DFS (Alice): " + sg.findSocialCircleIterative("Alice"));
        System.out.println("Recursive DFS (David): " + sg.findSocialCircle("David"));
        System.out.println("Iterative DFS (David): " + sg.findSocialCircleIterative("David"));
    }
}
