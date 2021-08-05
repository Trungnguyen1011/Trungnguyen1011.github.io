import java.util.Arrays;

public class _414_Third_Maximum_Number {
    public static void main(String[] args) {
        int[] nums = { 3, 2, 1 };
        thirdMax(nums);
    }

    public static int thirdMax(int[] nums) {
        int count = 0;

        Arrays.sort(nums);
        int max = nums[nums.length - 1];
        for (int i = nums.length - 2; i >= 0; i--) {

            if (nums[i] != nums[i + 1]) {
                count++;
                if (count == 2) {
                    return nums[i];

                }
            }

        }
        return max;
    }
}