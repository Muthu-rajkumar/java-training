package DAY18.CLASSTASK;

import java.util.ArrayDeque;
public class ArrayDequeTest {

    public static void main(String[] args) {
        ArrayDeque<Integer> dq = new ArrayDeque<>();
        dq.add(5);
        dq.add(6);
        dq.add(3);
        System.out.println(dq);
        System.out.println(dq.peek());
        System.out.println(dq.peek());
        System.out.println(dq);
    }
}
