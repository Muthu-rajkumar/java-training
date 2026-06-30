package DAY6.HOMETASK;

public class TotalDays {
        public static void main(String[] args) {
            int days = 0;

            for (int month = 1; month <= 12; month++) {
                for (int week = 1; week <= 4; week++) {
                    for (int day = 1; day <= 7; day++) {
                        days++;
                    }
                }
            }

            System.out.println("Total Days = " + days);
        }
    }
