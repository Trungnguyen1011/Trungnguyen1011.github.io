public class _1512_Number_of_Good_Pairs {
    public static void main(String[] args) {
        int [] nums = {1,2,3,1,1,3};
   
        System.out.println(numIdenticalPairs(nums));
    }

    public static int numIdenticalPairs(int[] nums) {
        int goodPairs = 0;
        for (int i = 0; i < nums.length-1; i++) {
            for (int j = i+1; j < nums.length; j++) {
                if (nums[i] == nums[j]) {
                    goodPairs++;
                }
            }
        }

        return goodPairs;
    }
}