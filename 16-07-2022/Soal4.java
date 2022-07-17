import java.util.ArrayList;

public class Soal4 {
    public static void main(String[] args) {
        int A[] = { 1, 2, 3, 3, 4 };
        ArrayList<Integer> move = new ArrayList<Integer>();

        // Asumsi array telah disorting ASC
        for (int i = 0; i < A.length; i++) {
            int count = 0;
            for (int j = 0; j < A.length; j++) {
                if (A[i] == A[j]) {
                    count++;
                }
            }
            if (count == 1) {
                move.add(A[i]);
            } else {
                move.add(A[i]);
                i = i + count - 1;
            }
        }
        System.out.print(move);
    }
}
