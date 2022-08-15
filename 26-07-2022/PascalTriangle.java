import java.util.ArrayList;
import java.util.Scanner;

public class PascalTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        sc.close();
        ArrayList<ArrayList<Integer>> pascal = new ArrayList<ArrayList<Integer>>();

        for (int i = 0; i < size; i++) {
            pascal.add(new ArrayList<Integer>());
            for (int j = 0; j < i + 1; j++) {
                if (j == 0 || j == i) {
                    pascal.get(i).add(1);
                } else {
                    if (j > 0 && j < i) {
                        int sum = pascal.get(i - 1).get(j) + pascal.get(i - 1).get(j - 1);
                        pascal.get(i).add(sum);
                    }
                }
            }
        }
        System.out.println(pascal);
    }
}
