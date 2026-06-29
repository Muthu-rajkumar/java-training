package DAY7.HOMETASK;

public class ReplaceNegative {
    public static void main(String[] args) {
        int arr[] = {-5, 10, -3, 8, 2};

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 0)
                arr[i] = 0;
        }

        for (int x : arr)
            System.out.print(x + " ");
    }
}