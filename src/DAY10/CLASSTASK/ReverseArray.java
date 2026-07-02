package DAY10.CLASSTASK;

public class ReverseArray {
    public static void main(String[] args) {
        String[] arr = {"Sam", "Jam", "Sam", "Tom"};

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (arr[i].equals(arr[j]) && i != j && i < j) {
                    System.out.println(arr[i]);
                }
            }
        }
    }
}
