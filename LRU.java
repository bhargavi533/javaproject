package pandu;

import java.util.*;

class LRU {
    private final int capacity;
    private final Map<Integer, Integer> map;
    private final Deque<Integer> deque;

    public LRU(int capacity) {
        this.capacity = capacity;
        this.map = new HashMap<>();
        this.deque = new LinkedList<>();
    }

    public int get(int key) {
        if (!map.containsKey(key)) {
            return -1;
        }
        // Move the key to the front as it is recently used
        deque.remove(key);
        deque.addFirst(key);
        return map.get(key);
    }

    public void put(int key, int value) {
        if (map.containsKey(key)) {
            deque.remove(key);
        } else if (deque.size() == capacity) {
            int leastUsed = deque.removeLast();
            map.remove(leastUsed);
        }
        deque.addFirst(key);
        map.put(key, value);
    }
}