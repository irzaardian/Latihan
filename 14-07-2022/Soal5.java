import java.util.Scanner;

public class Soal5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String password = sc.nextLine();
        boolean kapital = false;
        boolean numerik = false;

        for (int i = 0; i < password.length(); i++) {
            if (Character.isUpperCase(password.charAt(i))) {
                kapital = true;
            }
            if (Character.isDigit(password.charAt(i))) {
                numerik = true;
            }
        }
        if (kapital && numerik && password.length() >= 8) {
            System.out.println("Kuat");
        } else if (password.length() >= 12) {
            System.out.println("Agakkuat");
        } else {
            System.out.println("Lemah");
        }
        sc.close();
    }
}
