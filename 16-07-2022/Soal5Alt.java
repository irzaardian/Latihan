import java.util.Scanner;

/*
 * Dengan menggunakan class interface, kita bisa mengirimkan suatu fungsi sebagai parameter untuk fungsi lain
 * Disini kita memanfaatkan kemampuan class interface untuk menyediakan 'wadah' fungsi dengan nama dan parameter yang sama, dengan body/isi yang berbeda
 */
interface Comparator {
  Boolean compare(String bi, String bj);
}

public class Soal5Alt {
  static String[] sorting(String a[], String b[], String menu) {
    switch (menu) {
      /*
       * Contoh kasusnya adalah logic sorting ASC dan DESC yang perbedaannya hanya operasi komparasinya saja
       * Disini, kita membuat 2 buah object dari interface Comparator, yang mengimplementasikan fungsi compare dengan masing-masing jenis komparasi berbeda
       */
      case "ASC":
          Comparator compareAscending = new Comparator() { // OBJECT Comparator untuk ASCENDING
            @Override
            public Boolean compare(String bi, String bj){
              return bi.compareTo(bj) > 0; // Implementasi fungsi interface 'compare'
            }
          };

          swap(a, b, compareAscending); // OBJECT compareAscending dikirim ke fungsi 'swap'
          break;
      case "DESC":
          Comparator compareDescending = new Comparator() { // OBJECT Comparator untuk DESCENDING
            @Override
            public Boolean compare(String bi, String bj){
              return bi.compareTo(bj) < 0; // Implementasi fungsi interface 'compare'
            }
          };

          swap(a, b, compareDescending); // OBJECT compareDescending dikirim ke fungsi 'swap'
          break;
      default:
          return a;
  }
  return a;
}

/*
 * Fungsi 'swap' menerima OBJECT Comparator sebagai parameter ketiga
 */
static String[] swap(String a[], String b[], Comparator comparator) {
  for (int i = 0; i < b.length; i++) {
    for (int j = i + 1; j < b.length; j++) {
      /* 
      * Object comparator menjalankan fungsi compare-nya, sesuai dengan object yang masuk.
      * Jika yang masuk adalah compareAscending, maka dijalankan 'compare' dari compareAscending. Begitupun sebaliknya.
      */
      if (comparator.compare(b[i], b[j])) {
        String temp = b[i];
        b[i] = b[j];
        b[j] = temp;
    
        String temp_buku = a[i];
        a[i] = a[j];
        a[j] = temp_buku;
      }
    }
  }
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
            "Anna Karenina", "Bambi", "Bamboleo", "The Art of War" };
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
