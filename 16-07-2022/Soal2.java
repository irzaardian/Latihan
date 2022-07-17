import java.util.ArrayList;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Soal2 {
    public static void main(String[] args) {
        ArrayList<String> token = new ArrayList<String>();
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        sc.close();
        StringTokenizer st1 = new StringTokenizer(input);
        int operasi = 0;
        while (st1.hasMoreTokens()) {
            token.add(st1.nextToken());
        }
        if (token.size() > 1) {
            switch (token.get(1)) {
                case "+":
                    operasi = Integer.parseInt(token.get(0)) + Integer.parseInt(token.get(2));
                    break;
                case "-":
                    operasi = Integer.parseInt(token.get(0)) - Integer.parseInt(token.get(2));
                    break;
                case "*":
                    operasi = Integer.parseInt(token.get(0)) * Integer.parseInt(token.get(2));
                    break;
                case "/":
                    operasi = Integer.parseInt(token.get(0)) / Integer.parseInt(token.get(2));
                    break;
            }
        }
        System.out.println(operasi);
    }
}
