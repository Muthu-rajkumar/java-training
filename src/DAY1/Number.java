package DAY1;

class Number {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        int c = 15;

        if (a > b) {
            if (b > c) {
                System.out.println("a is the largest");
            } else {
                System.out.println("c is the largest");
            }
        } else {
            if (b > c) {
                System.out.println("b is the largest");
            } else {
                System.out.println("c is the largest");
            }
        }
    }
}