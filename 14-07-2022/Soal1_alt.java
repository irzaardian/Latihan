import java.util.ArrayList;
import java.util.Scanner;

public class Soal1_alt {
    public static void main(String[] args) {
        ArrayList<String> minuman = new ArrayList<String>();
        Scanner sc = new Scanner(System.in);
        int uang = sc.nextInt();
        int Cola = 7000;
        int Aqua = 5000;
        int Frutang = 3000;

        if (uang < 3000) {
            System.out.println("Uang tidak mencukupi");
        } else {
            while (uang >= 3000) { // harga minuman termurah
                if (uang >= Cola) {
                    minuman.add("Cola");
                    uang = uang - Cola;
                }
                if (uang >= Aqua) {
                    minuman.add("Aqua");
                    uang = uang - Aqua;
                }
                if (uang >= Frutang) {
                    minuman.add("Frutang");
                    uang = uang - Frutang;
                }
            }
            for (int i = 0; i < minuman.size(); i++) {
                System.out.println(minuman.get(i));
            }
        }
        sc.close();
    }
}
