package DAY6.HOMETASK;

public class StopAfterJune {
    public static void main(String[] args) {
        outer:
        for (int month = 1; month <= 12; month++) {
            for (int week = 1; week <= 4; week++) {
                for (int day = 1; day <= 7; day++) {
                    System.out.println("Month " + month + " Week " + week + " Day " + day);
                }
            }

            if (month == 6)
                break outer;
        }
    }
}