package DAY19.HOMETASK;

import java.util.HashMap;
import java.util.Map;

public class MaxOccurrence {
    public static void main(String[] args) {
        String str = "success";
        Map<Character, Integer> charCountMap = new HashMap<>();
        for (char c : str.toCharArray()) {
            charCountMap.put(c, charCountMap.getOrDefault(c, 0) + 1);
        }
        char maxChar = '\0';
        int maxCount = 0;

        for (Map.Entry<Character, Integer> entry : charCountMap.entrySet()) {
            if (entry.getValue() > maxCount) {
                maxChar = entry.getKey();
                maxCount = entry.getValue();
            }
        }
        System.out.println(maxChar + " = " + maxCount);
    }
}
