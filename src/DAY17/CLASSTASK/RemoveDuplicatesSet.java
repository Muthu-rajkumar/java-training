package DAY17.CLASSTASK;

import java.util.HashSet;

public class RemoveDuplicatesSet {
    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 3, 4, 5, 5, 6};
        HashSet<Integer> hs = new HashSet<>();

        for (int i : arr) {
            hs.add(i);
        }
        System.out.println(hs);
    }
}
