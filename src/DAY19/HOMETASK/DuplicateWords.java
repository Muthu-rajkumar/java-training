package DAY19.HOMETASK;
import java.util.*;

public class DuplicateWords {
    public static void main(String[] args) {
        String sentence = "java is easy and java is powerful and java is popular";
        String[] words = sentence.split(" ");
        Map<String, Integer> wordCountMap = new HashMap<>();
        for (String word : words) {
            wordCountMap.put(word, wordCountMap.getOrDefault(word, 0) + 1);
        }
        Set<String> duplicates = new HashSet<>();
        for (Map.Entry<String, Integer> entry : wordCountMap.entrySet()) {
            if (entry.getValue() > 1) {
                duplicates.add(entry.getKey());
            }
        }
        System.out.println(duplicates);
    }
}
