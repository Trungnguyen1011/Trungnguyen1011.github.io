public class _977_Squares_of_a_Sorted_Array {
    public static void main(String[] args) {
        int[] num1 = { -4, -1, 0, 3, 10 };
        int[] num2 = { -7, -3, 2, 3, 11 };
        int[] num3 = { -5, -3, -2, -1 };
        int[] num4 = { -9, -7, -5, -3, -1, 2, 4, 4, 7, 10 };
        int[] num5 = {-4};
    
        int[] result1 = sortedSquares(num4);
        int[] result2 = sortedSquares(num5);
        System.out.println("DONE");
    }
    public static int[] sortedSquares(int[] nums) {
        int [] newArr = new int[nums.length];
        int i =0;
        int j= nums.length-1;
        int k = nums.length-1;
        int temp = 0;
        while (k >= 0) {
            if (Math.abs(nums[i]) > Math.abs(nums[j]) ) {
                newArr[k] = nums[i]*nums[i];
                i++;
            } else {
                newArr[k] = nums[j]*nums[j];
                j--;
            }
            k--;
        }

        return newArr;
    }
    public static int[] sortedSquaresss(int[] nums) {
        if (nums.length == 0) { return nums;}
        int[] newArray = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            nums[i] *= nums[i];
        }
        int j = nums.length -1; int max = 0; int indexToRemove = 0;
        while (j >=0) {
            max =0;
        for (int k = 0; k < nums.length; k++) {
            if (nums[k] > max) {
                max =nums[k];
                indexToRemove = k ;
            }

        }
        newArray[j] = max;
        nums[indexToRemove] =0;
        j--;
    }
        
        return newArray;
      }
    }

