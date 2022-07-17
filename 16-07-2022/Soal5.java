import java.util.Scanner;

public class Soal5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String buku[] = { "The Da Vinci Code", "A Walk To Remember", "Pride and Prejudice", "Harry Potter",
                "Anna Karenina", "Bambi" };
        String buku_op[] = new String[buku.length];
        String menu = sc.nextLine();
        sc.close();
        for (int i = 0; i < buku_op.length; i++) {
            buku_op[i] = buku[i].replaceAll("\\s", "").toLowerCase();
        }
        switch (menu) {
            case "ASC":
                for (int i = 0; i < buku_op.length; i++) {
                    for (int j = i + 1; j < buku_op.length; j++) {
                        if (buku_op[i].compareTo(buku_op[j]) > 0) {
                            String temp = buku_op[i];
                            buku_op[i] = buku_op[j];
                            buku_op[j] = temp;

                            String temp_buku = buku[i];
                            buku[i] = buku[j];
                            buku[j] = temp_buku;
                        }
                    }
                }
                for (int i = 0; i < buku.length; i++) {
                    System.out.println(buku[i]);
                }
                break;
            case "DESC":
                for (int i = 0; i < buku_op.length; i++) {
                    for (int j = i + 1; j < buku_op.length; j++) {
                        if (buku_op[i].compareTo(buku_op[j]) < 0) {
                            String temp = buku_op[i];
                            buku_op[i] = buku_op[j];
                            buku_op[j] = temp;

                            String temp_buku = buku[i];
                            buku[i] = buku[j];
                            buku[j] = temp_buku;
                        }
                    }
                }
                for (int i = 0; i < buku.length; i++) {
                    System.out.println(buku[i]);
                }
                break;
            default:
                for (int i = 0; i < buku.length; i++) {
                    System.out.println(buku[i]);
                }
                break;
        }
    }
}
