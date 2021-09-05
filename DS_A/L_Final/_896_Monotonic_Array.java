public class _896_Monotonic_Array {
    public static void main(String[] args) {
        int[] nums = { 4, 3, 3, 1 };
        boolean result = Solution.isMonotonic(nums);
        System.out.println(result);
        System.out.println("Done!");
    }

    class Solution {
        public static boolean isMonotonic(int[] nums) {
            int i = 0;
            int j = nums.length - 1;
            if (nums.length > 1) {
                if (nums[i] >= nums[j]) {
                    for (int k = 0; k < nums.length - 1; k++) {
                        if (nums[k] < nums[k + 1]) {
                            return false;
                        }
                    }
                } else {
                    for (int k = 0; k < nums.length - 1; k++) {
                        if (nums[k] > nums[k + 1]) {
                            return false;
                        }
                    }
                }

            }
            return true;
        }
    }
}