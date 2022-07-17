import java.util.ArrayList;

public class Soal4 {
    public static void main(String[] args) {
        int A[] = { 1, 1, 2, 3, 5, 3, 4, 4, 4, 5 };
        ArrayList<Integer> move = new ArrayList<Integer>();

        for (int i = 0; i < A.length; i++) {
            boolean duplicate = move.contains(A[i]);
            if (!duplicate) {
                move.add(A[i]);
            }
        }
        System.out.println(move);
    }
}
