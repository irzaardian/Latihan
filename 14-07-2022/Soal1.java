import java.util.ArrayList;
import java.util.Scanner;

public class Soal1 {
    public static void main(String[] args) {
        ArrayList<String> minuman = new ArrayList<String>();
        Scanner sc = new Scanner(System.in);
        int uang = sc.nextInt();
        int Cola = 7000;
        int Aqua = 5000;
        int Frutang = 3000;

        if (uang == Cola) {
            System.out.println("Cola");
        } else if (uang == Aqua) {
            System.out.println("Aqua");
        } else if (uang == Frutang) {
            System.out.println("Frutang");
        } else if (uang > Cola && uang > Aqua && uang > Frutang) {
            if (uang >= Cola) {
                minuman.add("Cola");
                uang = uang - Cola;
                if (uang >= Aqua) {
                    minuman.add("Aqua");
                    uang = uang - Aqua;
                    if (uang >= Frutang) {
                        minuman.add("Frutang");
                        uang = uang - Frutang;
                    }
                } else if (uang >= Frutang) {
                    minuman.add("Frutang");
                    uang = uang - Frutang;
                }
            }

            for (int i = 0; i < minuman.size(); i++) {
                System.out.println(minuman.get(i));
            }
        } else {
            System.out.println("Uang tidak mencukupi");
        }
        sc.close();
    }
}
