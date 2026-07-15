package DAY19.HOMETASK;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Names {
    public static void main(String[] args) {
        String[] names = {"Arun", "Bala", "Ajay", "Kiran", "Akash", "Vignesh"};
        List<String> result = Arrays.stream(names)
                .filter(name -> name.startsWith("A"))
                .collect(Collectors.toList());
        System.out.println(result);
    }
}
