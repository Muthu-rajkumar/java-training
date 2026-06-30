package DAY1;

class ReverseNumber {
    public static void main(String[] args) {
        int num = 123;
        int reversed = 0;

        // Extract digits using % and /
        int digit1 = num % 10;
        int digit2 = (num / 10) % 10;  // Middle digit: 12 % 10 = 2
        int digit3 = num / 100;       // First digit: 123 / 100 = 1

        reversed = digit1 * 100 + digit2 * 10 + digit3;
        System.out.println("Original number: " + num);
        System.out.println("Reversed number: " + reversed);
    }
}