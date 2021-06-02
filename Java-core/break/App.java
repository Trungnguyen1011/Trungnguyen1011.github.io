import java.util.Map;
import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        StringUtil stringUtil = new StringUtil();

        String strA = new String("Cuộc đời vẫn đẹp sao");

        String strB = "đẹp";

        // if (strA.contains(strB)) {
        // System.out.println("\"" + strA +"\" chứa \"" + strB + "\"");
        // } else {
        // System.out.
        // System.out.println("\"" + strA + "\" không chứa \"" + strB + // "\""); // }

        boolean isContain = stringUtil.isContain(strA, strB);

        if (isContain) {
            System.out.println(strA + " có chứa " + "\"" + strB + "\"");
        } else {
            System.out.println(strA + " không chứa " + "\"" + strB + "\"");
        }

        System.out.println("Chuỗi bạn muốn đảo ngược : ");
        String strC = "đảo ngược nè";
        System.out.println("Chuỗi " + "\"" + strC + "\"" + " đảo ngược lại là: ");
        String reverse = stringUtil.reverse(strC);
        System.out.println("\"" + reverse + "\"");

        String strD = "Cuộc đời vẫn đẹp sao";
        System.out.println("Chuỗi bạn muốn kiểm tra: " + strD);
        String strE = "đẹp";
        System.out.println("Nhập phần tử bạn muốn kiểm tra vị trí: " + strE);
        int find = stringUtil.find(strD, strE);
        System.out.print("Kết quả: ");
        System.out.println(find);

        System.out.println("Nhập chuỗi mà bạn muốn in hoa chữ cái đầu của mỗi phần tử: ");
        String strF = "in hoa chữ đầu tiên";
        System.out.println(strF);
        String camelCase = stringUtil.camelCase(strF);
        System.out.print("Kết quả là: ");
        System.out.println(camelCase);

        String strG = "Không có gì quý hơn độc lập tự do";
        System.out.print("Chữ dài nhất của dãy " + "\"" + strG + "\"" + " là: ");
        String longestWord = stringUtil.longestWord(strG);
        System.out.println("\"" + longestWord + "\"");

        String strH = "Một con mèo, hai con chó, chó đuổi mèo";
        System.out.println("Số lần xuất hiện của mỗi từ trong đoạn văn " + "\"" + strH + "\"" + " là: ");
        Map<String, Integer> map = stringUtil.countWords(strH);
        for (String i : map.keySet()) {
            System.out.println("Từ " + i + " có số lần xuất hiện là: " + map.get(i));

        }
    }
}