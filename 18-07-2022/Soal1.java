import java.util.ArrayList;
import java.util.Scanner;

public class Soal1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> sort = new ArrayList<String>();
        String buku[] = { "Inventing Anna", "A Walk To Remember", "Pride and Prejudice",
                "Harry Potter and The Goblet of Fire", "Anna Karenina", "The Walking Dead",
                "Harry Potter and The Deathly Hollows" };
        String input = sc.nextLine();
        sc.close();
        for (int i = 0; i < buku.length; i++) {
            if (buku[i].toLowerCase().contains(input)) {
                sort.add(buku[i]);
            }
        }
        for (int i = 0; i < sort.size(); i++) {
            for (int j = i + 1; j < sort.size(); j++) {
                if (sort.get(i).toLowerCase().compareTo(sort.get(j).toLowerCase()) > 0) {
                    String temp = sort.get(i);
                    sort.set(i, sort.get(j));
                    sort.set(j, temp);
                }
            }
            System.out.println(sort.get(i));
        }

    }
}
