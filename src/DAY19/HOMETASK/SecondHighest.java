package DAY19.HOMETASK;

import java.util.Arrays;

public class SecondHighest {
    public static void main(String[] args) {
        int[] arr = {12, 45, 23, 89, 67, 89, 34};
        int[] sortedUnique = Arrays.stream(arr)
                .distinct()   // remove duplicates
                .sorted()     // ascending order
                .toArray();

        int secondHighest = sortedUnique[sortedUnique.length - 2]; // second last element
        System.out.println("Second highest element: " + secondHighest);
    }
}
