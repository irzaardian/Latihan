
public class MatrixDiagonalSum {
    public static void main(String[] args) {
        int m[][] = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
        // int m[][] = { { 1, 1, 1, 1 }, { 1, 1, 1, 1 }, { 1, 1, 1, 1 }, { 1, 1, 1,
        // 1 } };
        // int m[][] = { { 5 } };
        int d1 = 0;
        int d2 = 0;
        int center = m[m.length / 2][m.length / 2];
        int kIterator = m.length - 1;
        for (int i = 0; i < m.length; i++) {
            for (int j = i; j <= i; j++) {
                d1 = d1 + m[i][j];
            }
            if (m.length % 2 != 0) { // size m ganjil
                for (int k = kIterator; k >= kIterator; k--) {
                    if (m[i][k] != center) {
                        d2 = d2 + m[i][k];
                    }
                }
            } else { // size m genap
                for (int k = kIterator; k >= kIterator; k--) {
                    d2 = d2 + m[i][k];
                }
            }
            kIterator--;
        }
        System.out.println(d1 + d2);
    }
}
