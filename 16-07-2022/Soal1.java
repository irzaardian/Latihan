import java.util.Scanner;

public class Soal1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        boolean first_print = false;
        int temp = 0;
        while (input > 0) {
            temp = input % 10;
            input = input / 10;
            if (first_print == false) {
                if (temp != 0) {
                    System.out.print(temp);
                    first_print = true;
                }
            } else {
                System.out.print(temp);
            }
        }
        sc.close();
    }
}
