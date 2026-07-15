package DAY21.HOMETASK;

import java.util.*;

public class Long {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("Java", "SpringBoot", "SQL", "Microservices");

        String longest = list.stream()
                .max(Comparator.comparingInt(String::length))
                .orElse("");

        System.out.println(longest);
    }
}