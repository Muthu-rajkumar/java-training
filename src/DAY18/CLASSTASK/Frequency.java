package DAY18.CLASSTASK;

import java.util.HashMap;

public class Frequency {
    public static void main(String[] args) {
        String name = "Saravanan".toLowerCase(); // convert to lowercase for consistency
        HashMap<Character, Integer> freqMap = new HashMap<>();

        // Count frequency of each character
        for (char ch : name.toCharArray()) {
            freqMap.put(ch, freqMap.getOrDefault(ch, 0) + 1);
        }

        for (char ch : freqMap.keySet()) {
            System.out.println(ch + ":" + freqMap.get(ch));
        }
    }
}
