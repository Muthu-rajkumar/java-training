package DAY11.CLASSTASK;

public class AmstrongNumber {
    public static void main(String[] args) {
        int num = 153;  // Example number
        if (checkArmstrong(num)) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }

    public static boolean checkArmstrong(int num) {
        int original = num;
        int sum = 0;

        while (num > 0) {
            int rem = num % 10;
            sum += Math.pow(rem, 3);
            num = num / 10;
        }
        if (original == sum) {
            return true;
        } else {
            return false;
        }
    }
}
