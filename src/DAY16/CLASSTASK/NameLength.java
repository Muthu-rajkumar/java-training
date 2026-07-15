package DAY16.CLASSTASK;

import java.util.ArrayList;

public class NameLength {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();
        names.add("Sandhiya");
        names.add("Muthuraj");
        names.add("ms");
        names.add("Surya");
        names.add("Ajith");

        for (String name : names) {
            System.out.println(name + " " + name.length());
        }
    }
}

