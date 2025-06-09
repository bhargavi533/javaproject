package com.bhargavi;
import java.util.*;

public class ZooBFS {
    public static void main(String[] args) {
        Map<String, List<String>> zooMap = new HashMap<>();

        zooMap.put("Entrance", Arrays.asList("Reptile House", "Bird Sanctuary", "Mammal Zone"));
        zooMap.put("Reptile House", Arrays.asList("Snake Pit"));
        zooMap.put("Bird Sanctuary", Arrays.asList("Parrot Pavilion"));
        zooMap.put("Mammal Zone", Arrays.asList("Lion Den", "Elephant Enclosure"));
        zooMap.put("Snake Pit", new ArrayList<>());
        zooMap.put("Parrot Pavilion", new ArrayList<>());
        zooMap.put("Lion Den", new ArrayList<>());
        zooMap.put("Elephant Enclosure", new ArrayList<>());

        System.out.println(" Zoo Tour using BFS:");
        bfs(zooMap, "Entrance");
    }

    public static void bfs(Map<String, List<String>> graph, String start) {
        Queue<String> queue = new LinkedList<>();
        Set<String> visited = new HashSet<>();

        queue.add(start);
        visited.add(start);

        while (!queue.isEmpty()) {
            String current = queue.poll();
            System.out.println("Visited: " + current);

            for (String neighbor : graph.getOrDefault(current, new ArrayList<>())) {
                if (!visited.contains(neighbor)) {
                    queue.add(neighbor);
                    visited.add(neighbor);
                }
            }
        }
    }
}
