public class Holidays {
    public static void main(String[] args) {
        int holidays = 0;

        for (int month = 1; month <= 12; month++) {
            for (int week = 1; week <= 4; week++) {

                System.out.println("Month " + month + " Week " + week + " Sunday");
                holidays++;

                if (week == 2) {
                    System.out.println("Month " + month + " Week 2 Saturday");
                    holidays++;
                }
            }
        }

        System.out.println("Total Holidays = " + holidays);
    }
}