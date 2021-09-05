
import java.util.Arrays;

import java.util.List;

public class _13_Roman_to_Integer {
    public static void main(String[] args) {
        String s = "MCMXCIV";
        int result = Solution.romanToInt(s);
        System.out.println(result);
        System.out.println("Done!");
    }

    class Solution {
        // 'M', 'D', 'C', 'L', 'X', 'V', 'I'
        public static int romanToInt(String s) {

            int result = 0;
            Character[] ch = { 'M', 'D', 'C', 'L', 'X', 'V', 'I' };
            List<Character> list = Arrays.asList(ch);

            char[] character = s.toCharArray();
            for (int i = 0; i < character.length; i++) {
                int temp = list.indexOf(character[i]);

                switch (temp) {
                    case 0:
                        result += 1000;
                        break;
                    case 1:
                        result += 500;
                        break;
                    case 2:
                        if (i == character.length - 1) {
                            result += 100;
                        } else if (character[i + 1] == 'D' || character[i + 1] == 'M') {
                            result -= 100;
                        } else {
                            result += 100;
                        }

                        break;
                    case 3:
                        result += 50;
                        break;
                    case 4:
                        if (i == character.length - 1) {
                            result += 10;
                        } else if (character[i + 1] == 'C' || character[i + 1] == 'L') {
                            result -= 10;
                        } else {
                            result += 10;
                        }
                        break;
                    case 5:
                        result += 5;
                        break;
                    case 6:
                        if (i == character.length - 1) {
                            result += 1;
                        } else if (character[i + 1] == 'X' || character[i + 1] == 'V') {
                            result -= 1;
                        } else {
                            result += 1;
                        }
                        break;
                    default:
                        break;
                }

            }
            return result;
        }
    }
}
