import java.util.Arrays;

public class SortEvenOddIndices {
    public static void main(String[] args) {
        int nums[] = { 3, 2, 1, 4 };
        for (int i = 1; i < nums.length; i = i + 2) {
            for (int j = 1; j < nums.length - 2; j = j + 2) {
                if (nums[j] < nums[j + 2]) {
                    int temp = nums[j];
                    nums[j] = nums[j + 2];
                    nums[j + 2] = temp;
                }
            }
        }

        for (int i = 0; i < nums.length; i = i + 2) {
            for (int j = 0; j < nums.length - 2; j = j + 2) {
                if (nums[j] > nums[j + 2]) {
                    int temp = nums[j];
                    nums[j] = nums[j + 2];
                    nums[j + 2] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(nums));
    }
}
