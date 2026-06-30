package DAY8.CLASSTASK;

import java.util.Arrays;

public class Move {
        public static void main(String[] args) {
            int[] arr = {2, 0, 3, 0, 5};
            int[] result = new int[arr.length];
            int index = 0;

            for (int i = 0; i < arr.length; i++) {
                if (arr[i] != 0) {
                      result[index] = arr[i];
                    index++;
            }
            System.out.println(Arrays.toString(result));
        }
    }

}
