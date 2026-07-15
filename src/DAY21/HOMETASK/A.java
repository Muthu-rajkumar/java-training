package DAY21.HOMETASK;

import java.util.*;

public class A {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("Apple", "Banana", "Ant", "Cat", "Aeroplane");

        long count = list.stream()
                .filter(s -> s.startsWith("A"))
                .count();

        System.out.println(count);
    }
}