public class MatrixTranspose {
    public static void main(String[] args) {
        int A[][] = { { 1, 2, 3 }, { 4, 5, 6 } };
        int B[][] = { { 1, 4 }, { 2, 5, }, { 3, 6 } };

        int row = A.length;
        int column = A[0].length;
        boolean equal_check = true;
        int A_transpose[][] = new int[column][row];

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                A_transpose[j][i] = A[i][j];
            }
        }

        for (int i = 0; i < column; i++) {
            for (int j = 0; j < row; j++) {
                if (A_transpose[i][j] != B[i][j]) {
                    equal_check = false;
                }
            }
        }
        System.out.println(equal_check);
    }
}
