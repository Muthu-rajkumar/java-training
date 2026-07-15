package DAY19.HOMETASK;

import java.util.Arrays;
public class AvgGreater {
    public static void main(String[] args) {
        int[] arr = {25, 60, 80, 40, 90, 55, 30, 100};
        double avg = Arrays.stream(arr)
                .filter(n -> n > 50)
                .average()
                .orElse(0);

        System.out.println("Average: " + avg);
    }
}
