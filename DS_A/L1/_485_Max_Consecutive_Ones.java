public class _485_Max_Consecutive_Ones {
    public static void main(String[] args) {
        int[] num1 = { 1, 1, 0, 1, 1, 1 };
        int[] num2 = { 1, 0, 1, 1, 0, 1 };
        System.out.println(findMaxConsecutiveOnes(num1));
        System.out.println(findMaxConsecutiveOnes(num2));
    }

    public static int findMaxConsecutiveOnes(int[] nums) {
        int count = 0;
        int longestOne = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 1) {
                count++;
            } else {
                count = 0;
            }
            if (count > longestOne) {
                longestOne = count;
            }

        }
        return longestOne;
    }
}