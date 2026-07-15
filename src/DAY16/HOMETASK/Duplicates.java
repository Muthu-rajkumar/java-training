package DAY16.HOMETASK;

import java.util.ArrayList;
import java.util.HashSet;

public class Duplicates {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();

        list.add(1);
        list.add(2);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(4);
        list.add(5);

        HashSet<Integer> set = new HashSet<>(list);

        System.out.println(set);
    }
}