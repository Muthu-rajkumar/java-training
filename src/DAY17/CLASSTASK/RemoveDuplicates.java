package DAY17.CLASSTASK;

import java.util.ArrayList;

public class RemoveDuplicates {
    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 3, 4, 5, 5, 6};  // fixed semicolon

        ArrayList<Integer> a = new ArrayList<>();
        ArrayList<Integer> b = new ArrayList<>();
        for (int i : arr) {
            a.add(i);
        }
        for (int i = 0; i < a.size(); i++) {
            boolean dup = false;
            for (int j = i + 1; j < a.size(); j++) {
                if (a.get(i).equals(a.get(j))) {
                    dup = true;
                    break;
                }
            }
            if (!dup) {
                b.add(a.get(i));
            }
        }

        System.out.println(b);
    }
}
