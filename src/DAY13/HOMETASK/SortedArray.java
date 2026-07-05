package DAY13.HOMETASK;
public class SortedArray {
    public static void main(String[] args) {
        int arr[] = {10, 20, 30, 40, 50};
        int i;

        for (i = 0; i < arr.length - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                System.out.println("Not Sorted");
                return;
            }
        }

        System.out.println("Sorted");
    }
}