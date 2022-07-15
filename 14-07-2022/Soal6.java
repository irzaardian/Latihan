import java.util.Scanner;

public class Soal6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int usia = sc.nextInt();
        int bb = sc.nextInt();
        float tinggi = sc.nextFloat();
        double bmi;

        if (usia >= 18) {
            bmi = bb / Math.pow(tinggi, 2);
            System.out.println(bmi);
            if (bmi < 18.5) {
                System.out.println("Berat badan kurang");
            }
            if (bmi >= 18.5 && bmi <= 22.9) {
                System.out.println("Berat badan normal");
            }
            if (bmi >= 23 && bmi <= 29.9) {
                System.out.println("Berat badan berlebih (kecenderungan obesitas)");
            }
            if (bmi >= 30) {
                System.out.println("Obesitas");
            }
        } else {
            System.out.println("Usia tidak mencukupi");
        }
    }
}
