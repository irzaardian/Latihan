import java.text.NumberFormat;
import java.util.Scanner;

public class CurrencyFormatter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        NumberFormat num = NumberFormat.getInstance();
        int n = sc.nextInt();
        sc.close();
        num.setMaximumFractionDigits(3);
        String convert = String.valueOf(num.format(n)).replace(",", ".");

        System.out.println("Rp " + convert + ",00");
    }
}
