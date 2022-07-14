import java.util.Scanner;

public class Soal3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int panjang = 3;
        String A[] = new String[panjang];
        for (int i = 0; i < A.length; i++) {
            A[i] = scan.nextLine();
        }
        String id_terpanjang = A[0];
        for (int i = 0; i < A.length; i++) {
            if (id_terpanjang.length() < A[i].length()) {
                id_terpanjang = A[i];
            }
        }
        System.out.println(id_terpanjang);
    }
}