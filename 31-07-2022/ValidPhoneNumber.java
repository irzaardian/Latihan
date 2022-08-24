import java.util.Scanner;

public class ValidPhoneNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        sc.close();
        boolean valid = false;
        if (s.matches("\\(\\d{3}\\)\\s\\d{3}-\\d{4}") || s.matches("\\d{3}-\\d{3}-\\d{4}")) {
            valid = true;
        }
        System.out.println(valid);
    }
}
