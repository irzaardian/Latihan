import java.util.ArrayList;
import java.util.Scanner;

public class BinerConversion {
    public static void main(String[] args) {
        ArrayList<Integer> result = new ArrayList<Integer>();
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        sc.close();
        while (input > 0) {
            result.add(input % 2);
            input = input / 2;
        }
        for (int i = result.size() - 1; i >= 0; i--) {
            System.out.print(result.get(i));
        }
    }
}
