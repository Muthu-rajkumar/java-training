package DAY21.CLASSTASK;

public class PrintReverse {
    public static void main(String[] args) {
        int a = 5;
        fun(a);
    }

    public static void fun(int a) {
        if (a == 0) {
            return;
        }
        System.out.println(a);
        a--;
        fun(a);
    }
}

