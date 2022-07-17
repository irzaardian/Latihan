import java.util.Scanner;

public class Soal5 {
    static String[] sorting(String a[], String b[], String menu) {
        for (int i = 0; i < b.length; i++) {
            for (int j = i + 1; j < b.length; j++) {
                switch (menu) {
                    case "ASC":
                        if (b[i].compareTo(b[j]) > 0) {
                            swap(a, b, i, j);
                        }
                        break;
                    case "DESC":
                        if (b[i].compareTo(b[j]) < 0) {
                            swap(a, b, i, j);
                        }
                        break;
                    default:
                        return a;
                }
            }
        }
        return a;
    }

    static String[] swap(String a[], String b[], int i, int j) {
        String temp = b[i];
        b[i] = b[j];
        b[j] = temp;

        String temp_buku = a[i];
        a[i] = a[j];
        a[j] = temp_buku;
        return a;
    }

    static void print_array(String a[]) {
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
    }

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
        String x[] = sorting(buku, buku_op, menu);
        print_array(x);
    }
}
