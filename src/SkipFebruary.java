public class SkipFebruary {
    public static void main(String[] args) {
        for (int month = 1; month <= 12; month++) {
            if (month == 2)
                continue;

            for (int week = 1; week <= 4; week++) {
                for (int day = 1; day <= 7; day++) {
                    System.out.println("Month " + month + " Week " + week + " Day " + day);
                }
            }
        }
    }
}