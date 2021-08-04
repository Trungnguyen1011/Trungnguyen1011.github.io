public class _26_Remove_Duplicates_from_Sorted_Array {
    public static void main(String[] args) {
        int[] num = {-11, 1,2,2,3,4,4,5,6,6,6,7};
        int[] num0 = {};
        int[] num1 = {1};
        int count = removeDuplicates(num);int count0 = removeDuplicates(num0);int count1 = removeDuplicates(num1);
        System.out.println("DONE");
    }
    public static int removeDuplicates(int[] num) {
        if (num.length == 0 || num.length == 1) {
            return num.length;
        }
        int i = 0;
        int j = 1;
        int count = num.length;
       
        while (j < num.length) {
            if (num[i] == num[j]) {  
                j++;
                count--;
            } else { num[i+1] = num[j]; i++; j++;}

        }
        return count;
    }
}
