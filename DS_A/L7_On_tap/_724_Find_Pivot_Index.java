public class _724_Find_Pivot_Index {
    public static void main(String[] args) {
        int[] nums = { -1, -1, -1, -1, 0, 1 };
        pivotIndex(nums);
        System.out.println(pivotIndex(nums));
    }

    public static int pivotIndex(int[] nums) {
        int result = -1;
        int totalSum = 0;
        int leftSum = 0;
        for (int num : nums) {
            totalSum += num;
        }
        for (int i = 0; i < nums.length; i++) {
            if (leftSum == (totalSum - nums[i]) - leftSum) {
                result = i;
                break;
            } else {
                leftSum += nums[i];
            }

        }

        return result;
    }
}
