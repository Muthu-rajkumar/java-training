import java.util.HashMap;
import java.util.Map;

public class Minimum {
    public static void main(String[] args) {
        HashMap<String, Integer> marks = new HashMap<>();
        marks.put("Arun", 90);
        marks.put("Priya", 85);
        marks.put("Kumar", 78);

        String minName = "";
        int minMark = Integer.MAX_VALUE;;

        for (Map.Entry<String, Integer> entry : marks.entrySet()) {
            if (entry.getValue() < minMark) {
                minMark = entry.getValue();
                minName = entry.getKey();
            }
        }

        System.out.println(minName + " " + minMark);
    }
}
