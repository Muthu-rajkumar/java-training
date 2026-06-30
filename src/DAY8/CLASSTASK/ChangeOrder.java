package DAY8.CLASSTASK;

import java.util.Arrays;

public class ChangeOrder {
    public static void main(String[] args) {
        String[] menu = {"vege", "nonveg", "sweet", "beverages"};
        String[] m1 = new String[menu.length];
        for (int i = 0; i < menu.length; i++) {
            m1[i] = menu[menu.length - 1 - i];
        }
        System.out.println(Arrays.toString(m1));
    }
}
