import java.util.Scanner;

public class SearchMatrix2D {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int matrix[][] = { { 1, 4, 7, 11, 15 }, { 2, 5, 8, 12, 19 }, { 3, 6, 9, 16, 22 }, { 10, 13, 14, 17, 24 },
                { 18, 21, 23, 26, 30 } };
        int target = sc.nextInt();
        sc.close();
        boolean found = false;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                if (target == matrix[i][j]) {
                    found = true;
                    break;
                }
            }
        }
        System.out.println(found);
    }
}
