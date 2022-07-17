import java.util.Scanner;

public class Soal3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        sc.close();
        int i = 1;
        int pengali = 1;
        while (i <= input) {
            pengali = i * pengali;
            i++;
        }
        System.out.println(pengali);
    }
}
