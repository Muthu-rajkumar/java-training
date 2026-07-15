package DAY19.HOMETASK;

import java.util.*;
public class GroupWords {
    public static void main(String[] args) {
        String[] words = {"Java", "API", "Spring", "Collection", "Map", "Queue"};
        Map<Integer, List<String>> lengthMap = new HashMap<>();
        for (String word : words) {
            int len = word.length();
            lengthMap.putIfAbsent(len, new ArrayList<>());
            lengthMap.get(len).add(word);
        }
        for (Map.Entry<Integer, List<String>> entry : lengthMap.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
    }
}
