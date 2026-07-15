package DAY19.HOMETASK;

import java.util.HashSet;
import java.util.Set;

public class FirstRepeatedCharacter {
    public static void main(String[] args) {
        String str = "programming";
        Set<Character> seen = new HashSet<>();
        for (char c : str.toCharArray()) {
            if (seen.contains(c)) {
                System.out.println("First repeated character: " + c);
                return;
            } else {
                seen.add(c);
            }
        }
        System.out.println("No repeated character found.");
    }
}
