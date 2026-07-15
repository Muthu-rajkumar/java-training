package DAY19.HOMETASK;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class RemoveDuplicates {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 20, 40, 10, 50, 30};
        List<Integer> uniqueList = Arrays.stream(arr)
                .distinct()     // removes duplicates
                .boxed()
                .collect(Collectors.toList());
        System.out.println(uniqueList);
    }
}
