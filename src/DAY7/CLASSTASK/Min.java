package DAY7.CLASSTASK;

public class Min {
    public static void main(String[] args) {
        int num[] = {22, 33, 3, 555, 4000};

        int min = num[0];
        for (int i = 0; i < num.length; i++) {
            if (num[i] < min) {
                min = num[i];
            }
        }
        System.out.println("Minimum : " + min);
    }
}
