import java.util.ArrayList;
import java.util.Scanner;

public class Palindrom {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        sc.close();
        char a[] = input.toCharArray();
        ArrayList<Character> b = new ArrayList<Character>();
        ArrayList<Character> c = new ArrayList<Character>();
        for (Character text : a) {
            c.add(text);
        }
        for (int i = a.length - 1; i >= 0; i--) {
            b.add(a[i]);
        }
        System.out.println(c.equals(b));
    }
}
