package com.bhargavi;

import java.util.*;

public class SimpleDFS {

    private Map<String, List<String>> homeMap = new HashMap<>();
    private Set<String> visited = new HashSet<>();

    public void addRoom(String room, String connectedRoom) {
        homeMap.computeIfAbsent(room, k -> new ArrayList<>()).add(connectedRoom);
        homeMap.computeIfAbsent(connectedRoom, k -> new ArrayList<>());
    }

    public void dfs(String currentRoom) {
        if (visited.contains(currentRoom)) return;

        visited.add(currentRoom);
        System.out.println("Visited: " + currentRoom);

        for (String neighbor : homeMap.getOrDefault(currentRoom, new ArrayList<>())) {
            dfs(neighbor);
        }
    }

    public static void main(String[] args) {
        SimpleDFS home = new SimpleDFS();
        home.addRoom("Living Room", "Kitchen");
        home.addRoom("Living Room", "Bedroom");
        home.addRoom("Bedroom", "Bathroom");

        System.out.println("DFS Traversal starting from Living Room:");
        home.dfs("Living Room");
    }
}
