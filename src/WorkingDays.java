public class WorkingDays {
    public static void main(String[] args) {
        int count = 0;

        for (int month = 1; month <= 12; month++) {
            for (int week = 1; week <= 4; week++) {
                for (int day = 1; day <= 5; day++) {
                    count++;
                }
            }
        }

        System.out.println("Working Days = " + count);
    }
}