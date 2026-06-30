package DAY8.CLASSTASK;
import java.util.Scanner;
public class UserId {

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter your User ID:");
            String userid = sc.nextLine();

            String onlyChars = userid.replaceAll("[^a-zA-Z]", "");
            System.out.println("User ID with only characters: " + onlyChars);

            sc.close();
        }
    }
