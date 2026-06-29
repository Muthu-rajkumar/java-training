package DAY7.CLASSTASK;
import java.util.*;

public class Even {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            if (i % 2 == 0) {
                sum += arr[i];
                System.out.println(sum);

            }
        }
        System.out.println("Final : " + sum);
    }
}
