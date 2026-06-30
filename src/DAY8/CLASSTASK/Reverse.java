package DAY8.CLASSTASK;
import java.util.Arrays;
public class Reverse {
        public static void main(String[] args) {
            int arr[] = {1, 2, 3, 4};
            int temp = arr[0];
            arr[0] = arr[3];
            arr[3] = temp;
            temp = arr[1];
            arr[1] = arr[2];
            arr[2] = temp;
                System.out.print(Arrays.toString(arr));
        }
}
