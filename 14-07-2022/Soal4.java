import java.util.Scanner;

public class Soal4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int first = 0;
        int second = 1;
        int temp = 0;
        for (int i = 0; i < n; i++) {
            System.out.print(first + " ");
            temp = first + second;
            first = second;
            second = temp;
        }
        sc.close();
    }
}
