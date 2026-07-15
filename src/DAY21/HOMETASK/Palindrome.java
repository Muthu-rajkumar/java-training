package DAY21.HOMETASK;

import java.util.*;
import java.util.stream.Collectors;

public class Palindrome {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("madam", "java", "level", "hello", "radar");

        List<String> result = list.stream()
                .filter(s -> s.equals(new StringBuilder(s).reverse().toString()))
                .collect(Collectors.toList());

        System.out.println(result);
    }
}
