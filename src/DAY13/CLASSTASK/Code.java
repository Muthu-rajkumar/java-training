package DAY13.CLASSTASK;

import java.util.Scanner;

public class Code {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int count = 0;
        System.out.println("Enter the word to count:");
        String s = sc.nextLine();

        for (int i = 0; i < s.length(); i++) {
            count = 0;

            for (int j = 0; j < s.length(); j++) {
                if (s.charAt(i) == s.charAt(j)) {
                    count++;
                }
            }

            System.out.println(s.charAt(i) + " : " + count);
        }

        sc.close();
    }
}