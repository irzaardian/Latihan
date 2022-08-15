
public class MatrixDiagonalSum {
    public static void main(String[] args) {
        // int m[][] = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
        // int m[][] = { { 1, 1, 1, 1 }, { 1, 1, 1, 1 }, { 1, 1, 1, 1 }, { 1, 1, 1,
        // 1 } };
        // int m[][] = { { 5 } };
        int m[][] = { { 2, 2, 2 }, { 2, 2, 2 }, { 2, 2, 2 } };
        int d1 = 0;
        int d2 = 0;
        int center = m.length / 2;
        int kIterator = m.length - 1;
        for (int i = 0; i < m.length; i++) {
            int j = i;
            d1 = d1 + m[i][j];

            if (m.length % 2 != 0) { // size m ganjil
                if (i != center && kIterator != center) {
                    d2 = d2 + m[i][kIterator];
                }
            } else { // size m genap
                d2 = d2 + m[i][kIterator];

            }
            kIterator--;
        }
        System.out.println(d1 + d2);
    }
}
