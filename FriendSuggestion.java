package pandu.com;
import java.util.*;

public class FriendSuggestion {

    private Map<String, List<String>> network;

    public FriendSuggestion(Map<String, List<String>> network) {
        this.network = network;
    }

    public Map<String, Integer> getMutualFriendsCount(String person) {
        Map<String, Integer> mutualCount = new HashMap<>();
        Set<String> directFriends = new HashSet<>(network.getOrDefault(person, new ArrayList<>()));

        for (String friend : directFriends) {
            List<String> friendsOfFriend = network.getOrDefault(friend, new ArrayList<>());

            for (String candidate : friendsOfFriend) {
                if (!candidate.equals(person) && !directFriends.contains(candidate)) {
                    mutualCount.put(candidate, mutualCount.getOrDefault(candidate, 0) + 1);
                }
            }
        }

        return mutualCount;
    }

    public List<String> suggestFriends(String person, int maxSuggestions) {
        Map<String, Integer> mutualCounts = getMutualFriendsCount(person);
        
        // Priority Queue to sort by most mutual friends (descending)
        PriorityQueue<Map.Entry<String, Integer>> pq = new PriorityQueue<>(
            (a, b) -> b.getValue().compareTo(a.getValue())
        );
        pq.addAll(mutualCounts.entrySet());

        List<String> suggestions = new ArrayList<>();
        while (!pq.isEmpty() && suggestions.size() < maxSuggestions) {
            suggestions.add(pq.poll().getKey());
        }

        return suggestions;
    }

    public static void main(String[] args) {
        Map<String, List<String>> network = new HashMap<>();
        network.put("Alice", Arrays.asList("Bob", "Charlie"));
        network.put("Bob", Arrays.asList("Alice", "David", "Eve"));
        network.put("Charlie", Arrays.asList("Alice"));
        network.put("David", Arrays.asList("Bob", "Eve"));
        network.put("Eve", Arrays.asList("Bob", "David"));

        FriendSuggestion fs = new FriendSuggestion(network);
        
        System.out.println("Mutual Friends Count: " + fs.getMutualFriendsCount("Alice"));
        System.out.println("Suggestions: " + fs.suggestFriends("Alice", 3));
    }
}
