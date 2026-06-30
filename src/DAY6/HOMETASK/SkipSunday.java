package DAY6.HOMETASK;

public class SkipSunday {
    public static void main(String[] args) {
        for (int month = 1; month <= 12; month++) {
            for (int week = 1; week <= 4; week++) {
                for (int day = 1; day <= 7; day++) {
                    if (day == 7)
                        continue;

                    System.out.println("Month " + month + " Week " + week + " Day " + day);
                }
            }
        }
    }
}