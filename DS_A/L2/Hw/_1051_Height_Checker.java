import java.util.Arrays;

public class _1051_Height_Checker {
    public static void main(String[] args) {
        int[] heights = { 1, 1, 4, 2, 1, 3 };
        heightChecker(heights);
    }

    public static int heightChecker(int[] heights) {
        int[] sortedArr = heights.clone();
        Arrays.sort(sortedArr);

        int count = 0;

        for (int i = 0; i < sortedArr.length; i++) {
            if (sortedArr[i] != heights[i]) {
                count++;
            }
        }
        return count;
    }
}
