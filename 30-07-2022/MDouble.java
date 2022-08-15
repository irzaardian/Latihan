public class MDouble {
    public static void main(String[] args) {
        int arr[] = { 3, 1, 7, 11 };
        boolean exist = false;

        for (int i = 0; i < arr.length; i++) {
            int j = 0;
            while (j < arr.length) {
                if (j == i) {
                    j++;
                } else if (arr[i] * 2 == arr[j]) {
                    exist = true;
                    break;
                }
                j++;
            }
        }
        System.out.println(exist);
    }
}
