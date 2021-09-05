import java.util.ArrayList;

import java.util.Collections;
import java.util.List;

public class _506_Relative_Ranks {
    public static void main(String[] args) {
        int[] score = { 10, 3, 8, 9, 4 };
        Solution.findRelativeRanks(score);
        System.out.println("Done!");
    }

    class Solution {
        public static String[] findRelativeRanks(int[] score) {
            String[] result = new String[score.length];
            List<Integer> ranks = new ArrayList<Integer>();
            for (int sc : score) {
                ranks.add(sc);
            }
            Collections.sort(ranks, Collections.reverseOrder());
            for (int i = 0; i < score.length; i++) {
                int temp = ranks.indexOf(score[i]);
                switch (temp) {
                    case 0:
                        result[i] = "Gold Medal";
                        break;
                    case 1:
                        result[i] = "Silver Medal";
                        break;
                    case 2:
                        result[i] = "Bronze Medal";
                        break;
                    default:
                        result[i] = String.valueOf(temp + 1);

                }
            }
            return result;
        }
    }
}
