import java.util.ArrayList;
import java.util.Scanner;

public class Soal2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> bil_prima = new ArrayList<Integer>();
        int jumlah = sc.nextInt();
        int jumlah_bilangan_prima = 0;
        for (int i = 1; i <= jumlah; i++) {
            int total_pembagi = 0;
            for (int j = 1; j <= i; j++) {
                if (i % j == 0) {
                    total_pembagi = total_pembagi + 1;
                }
            }
            if (total_pembagi == 2) {
                bil_prima.add(i);
                jumlah_bilangan_prima = jumlah_bilangan_prima + 1;
            }
        }
        if (jumlah_bilangan_prima > 0) {
            System.out.println(jumlah_bilangan_prima);
            System.out.println("Penjelasan");
            System.out.print("Bilangan primanya adalah ");
            for (int i = 0; i < bil_prima.size(); i++) {
                if (i == bil_prima.size() - 1) {
                    System.out.print(bil_prima.get(i));
                } else {
                    System.out.print(bil_prima.get(i) + ", ");
                }
            }
        } else {
            System.out.println(jumlah_bilangan_prima);
        }
        sc.close();
    }
}
