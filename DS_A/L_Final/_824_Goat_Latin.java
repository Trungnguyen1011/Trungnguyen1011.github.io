import java.text.CharacterIterator;
import java.text.StringCharacterIterator;
import java.util.ArrayList;
import java.util.List;

public class _824_Goat_Latin {
    public static void main(String[] args) {
        String s = "I speak Goat Latin";
        String result = Solution.toGoatLatin(s);
        System.out.println(result);
        System.out.println("Done!");
    }

    class Solution {
        static List<Character> list = new ArrayList<Character>();

        public static String toGoatLatin(String sentence) {
            boolean firstCharacter = true;
            boolean vowelStart = false;
            int count = 1;
            char temp = 't';
            String result = "";
            list.add('a');
            list.add('e');
            list.add('i');
            list.add('o');
            list.add('u');

            char[] chars = sentence.toCharArray();
            for (char c : chars) {
                if (list.contains(Character.toLowerCase(c)) && firstCharacter) {
                    vowelStart = true;
                    firstCharacter = false;
                    result += c;
                } else if (firstCharacter) {
                    temp = c;
                    firstCharacter = false;
                } else if (c == ' ') {
                    if (!vowelStart) {
                        result += temp;
                        result += "ma";
                    } else {
                        result += "ma";
                    }

                    for (int i = 0; i < count; i++) {
                        result += "a";
                    }
                    count++;
                    vowelStart = false;
                    firstCharacter = true;
                    result += " ";
                } else {
                    result += c;
                }

            }

            if (!vowelStart) {
                result += temp;
                result += "ma";
            } else {
                result += "ma";
            }

            for (int i = 0; i < count; i++) {
                result += "a";
            }

            return result;
        }

    }

}
