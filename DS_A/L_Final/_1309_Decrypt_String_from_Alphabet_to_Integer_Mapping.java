public class _1309_Decrypt_String_from_Alphabet_to_Integer_Mapping {
    public static void main(String[] args) {
        String s = "12345678910#11#12#13#14#15#16#17#18#19#20#21#22#23#24#25#26#";
        System.out.println(Solution.freqAlphabets(s));
        System.out.println("Done!");
    }

    class Solution {
        public static String freqAlphabets(String s) {
            String alphabets = "abcdefghijklmnopqrstuvwxyz";
            char[] chars = alphabets.toCharArray();
            String result = "";
            String jToZ = "";
            int i = 0;
            while (i < s.length()) {

                if (s.length() - i == 1) {
                    result += chars[getValue(s.charAt(i)) - 1];
                    break;
                } else if (s.length() - i == 2) {
                    result += chars[getValue(s.charAt(i)) - 1];
                    result += chars[getValue(s.charAt(i + 1)) - 1];
                    break;
                } else if (s.charAt(i + 2) == '#') {
                    jToZ += s.charAt(i);
                    jToZ += s.charAt(i + 1);
                    int temp = Integer.valueOf(jToZ);
                    result += chars[temp - 1];
                    i += 3;
                    jToZ = "";
                } else {
                    result += chars[getValue(s.charAt(i)) - 1];
                    i++;
                }
            }
            return result;
        }
        public static int getValue(char ch) {
            return Character.getNumericValue(ch);
        }
    }
}
