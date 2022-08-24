import java.util.Arrays;
import java.util.Scanner;

public class ValidAnagram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String t = sc.next();
        sc.close();
        char[] sArray = s.toLowerCase().toCharArray();
        char[] tArray = t.toLowerCase().toCharArray();
        Arrays.sort(sArray);
        Arrays.sort(tArray);

        if (Arrays.equals(sArray, tArray)) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }
    }
}
