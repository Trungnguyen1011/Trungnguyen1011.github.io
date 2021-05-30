import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import java.util.Scanner;

public class StringUtil {
    /*
     * Hãy viết hàm isContain để kiểm tra strA có chứa strB không mà không hàm có
     * sẵn trong String String strA = "Cuộc đời vốn đẹp"; String strB = "đẹp";
     */

    public boolean isContain(String strA, String strB) {
        Pattern p = Pattern.compile(strB);
        Matcher matcher = p.matcher(strA);
        Boolean result = matcher.find();
        return result;

    }

    /*
     * Nghịch đảo một chuỗi: Hello -> olleH
     */
    public String reverse(String str) {
        String reverse = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            reverse = reverse + str.charAt(i);
        }

        return reverse;
    }

    /*
     * trả về vị trí mà strB được tìm thấy trong strA -1: không tìm thấy >= 0: là vị
     * trí tìm thấy
     */
    public int find(String strA, String strB) {
        int find = strA.indexOf(strB);

        return find;
    }

    /*
     * Upper case ký tự đầu tiên của từ
     */
    public String camelCase(String input) {
        String camelCase = "";
        for (int i = 0; i < input.length(); i++) {
            if (i == 0) {
                char k = input.charAt(i);
                camelCase = camelCase + Character.toUpperCase(k);

            } else if (input.charAt(i - 1) == ' ') {
                char k = input.charAt(i);
                camelCase = camelCase + Character.toUpperCase(k);

            } else {
                camelCase = camelCase + input.charAt(i);
            }

        }

        return camelCase;
    }

    /*
     * "Không có gì quý hơn độc lập tự do" Từ dài nhất là "Không"
     */
    public String longestWord(String input) {
        int wordLength = 0;
        int longestOne = 0;
        String longestWord = "";
        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) != ' ') {
                wordLength++;
            } else if (wordLength > longestOne) {
                longestOne = wordLength;
                longestWord = input.substring(i - longestOne, i);
                wordLength = 0;
            } else {
                wordLength = 0;
            }

        }

        return longestWord;
    }

    /*
     * Đếm số lần tự lặp lại
     */

    /*
     * "Một con mèo, hai con chó, chó đuổi mèo" Một: 1 con: 2 mèo: 2 hai: 1 chó: 2
     * đuổi: 1
     */

    public Map<String, Integer> countWords(String input) {
        input = input.replaceAll(",", "");
        String[] str = input.split(" ");
        Map<String, Integer> map = new HashMap<String, Integer>();
        int count = 0;
        for (int i = 0; i < str.length; i++) {
            for (int j = 0; j < str.length; j++) {
                if (str[i].equalsIgnoreCase(str[j])) {
                    count++;

                }
            }
            map.put(str[i], count);
            count = 0;
        }

        return map;
    }

}