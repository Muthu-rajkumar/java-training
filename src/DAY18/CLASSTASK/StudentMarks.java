package DAY18.CLASSTASK;


import java.util.HashMap;

public class StudentMarks {
    public static void main(String[] args) {
        HashMap<String, Integer> marks = new HashMap<>();
        marks.put("Arun", 90);
        marks.put("Priya", 85);
        marks.put("Kumar", 78);
        System.out.println(marks);
        for (String name : marks.keySet()) {
            System.out.println(name + " " + marks.get(name));
        }
        }
    }

