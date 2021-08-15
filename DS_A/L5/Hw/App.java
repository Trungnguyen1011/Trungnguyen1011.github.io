import java.util.Arrays;

public class App {
    public static void main(String[] args) {

        // Constraints:
        // 1 <= nums.length <= 5 * 104
   
        int[] nums1 = { 5, 1, 1, 9, 7, 66, 9,8, 7,3, 4 ,4 ,8, 99 ,45 ,511, 475, 663 };
        int[] nums2 = { 5, 1, 1, 9, 7, 66, 9,8, 7,3, 4 ,4 ,8, 99 ,45 ,511, 475, 663 };
        int[] nums3 = { 5, 1, 1, 9, 7, 66, 9,8, 7,3, 4 ,4 ,8, 99 ,45 ,511, 475, 663 };
        int[] nums4 = { 5, 1, 1, 9, 7, 66, 9,8, 7,3, 4 ,4 ,8, 99 ,45 ,511, 475, 663 };
        int[] nums5 = { 5, 1, 1, 9, 7, 66, 9,8, 7,3, 4 ,4 ,8, 99 ,45 ,511, 475, 663 };
        Long start = System.nanoTime();
        bubbleSort(nums1);
        end(start);
        printOut(nums1);

        start = System.nanoTime();
        insertSort(nums2);
        end(start);
        printOut(nums2);

        start = System.nanoTime();
        selectionSort(nums3);
        end(start);
        printOut(nums3);

        start = System.nanoTime();
       int[] result = mergeSort(nums4);
        end(start);
        printOut(result);
        
        start = System.nanoTime();
        int[] result2 = quickSort(nums5);
        end(start);
        printOut(result2);

    }

    public static int[] bubbleSort(int[] num) {
        if (num.length == 1) {
            return num;
        }
        int i = 0;
        boolean isSwaped = false;
        boolean isSorted = false;
        while (!isSorted) {

            if (num[i] > num[i + 1]) {
                int temp = num[i + 1];
                num[i + 1] = num[i];
                num[i] = temp;
                isSwaped = true;
                i++;
            } else {
                i++;
            }
            if (i > num.length - 2) {
                if (isSwaped) {
                    i = 0;
                    isSwaped = false;
                } else {
                    isSorted = true;
                }

            }

        }

        return num;
    }

    public static int[] insertSort(int[] num) {
        if (num.length == 1) {
            return num;
        }

        for (int i = 0; i < num.length - 1; i++) {
            for (int j = i + 1; j > 0; j--) {
                if (num[j] < num[j - 1]) {
                    int temp = num[j];
                    num[j] = num[j - 1];
                    num[j - 1] = temp;
                } else {
                    break;
                }
            }
        }

        return num;
    }

    public static int[] selectionSort(int[] num) {
        if (num.length == 1) {
            return num;
        }
        int i = 0;
        int j = 0;
        int k = 0;
        int min = num[k];
        while (i < num.length - 1) {
            if (num[j] < min) {
                k = j;
                min = num[j];
                j++;
            } else {
                j++;
            }

            if (j > num.length - 1) {
                int temp = num[i];
                num[i] = num[k];
                num[k] = temp;
                i++;
                min = num[i];
                j = k = i;

            }
        }
        return num;
    }
    public static int[] mergeSort(int[] num) {
      
       return mergeSorting(num, 0, num.length -1);
    }
    public static int[] mergeSorting(int[] num, int left, int right) {

        if (left == right) { //index
            int number[] = { num[left] };
            return number;
        }

        int middle = (left + right) / 2;
        int num1[] = mergeSorting(num, left, middle);
        int num2[] = mergeSorting(num, middle + 1, right);

        int result[] = new int[num1.length + num2.length];

        int iResult = 0;
        int i1 = 0;
        int i2 = 0;

        while (iResult < result.length) {
            if (i1 < num1.length && i2 < num2.length) { 
                if (num1[i1] < num2[i2]) {
                    result[iResult] = num1[i1];
                    i1++;
                    iResult++;
                } else {
                    result[iResult] = num2[i2];
                    i2++;
                    iResult++;
                }
            } else if (i1 >= num1.length) {
                result[iResult] = num2[i2];
                    i2++;
                    iResult++;
            } else {
                result[iResult] = num1[i1];
                i1++;
                iResult++;
            }
        }

        return result;
    }

  
    public static int[] quickSort(int[] num) {
       quickSorting(num, 0, num.length-1);
      return num;
    }
    public static void quickSorting(int[] num, int left, int right) {
        if(left >= right) {return;}
        int mid = (left+right)/2;
        int key = num[mid];
        int iLeft = left;
        int iRight = right;
        while (iLeft <= iRight) {
            while(num[iLeft] < key) {
                iLeft++;
            }
            while(num[iRight] > key) {
                iRight--;
            }

            if(iLeft <= iRight) {
                int temp = num[iLeft];
                num[iLeft] = num[iRight];
                num[iRight] = temp;
                iLeft++; 
                iRight--;
            }   

        }
        quickSorting(num,left,iLeft -1);
        quickSorting(num,iLeft,right);
       
    }

    public static void end(Long start) {
        Long endTime = System.nanoTime();
        Long result = endTime - start;
        System.out.println("Time: " + result);
    }

    public static void printOut(int[] num) {
        for (int i : num) {
            System.out.print(i + " ");
        }
        System.out.println("\n---------------------");
    }

}