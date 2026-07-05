package DAY13.HOMETASK;

public class Compress {
    public static void main(String[] args) {
        String str = "aaabbccccdd";

        int count = 1;

        for (int i = 0; i < str.length(); i++) {

            while (i < str.length() - 1 &&
                    str.charAt(i) == str.charAt(i + 1)) {
                count++;
                i++;
            }

            System.out.print(str.charAt(i) + "" + count);
            count = 1;
        }
    }
}