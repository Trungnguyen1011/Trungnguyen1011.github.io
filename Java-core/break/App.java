import java.util.Map;
import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        StringUtil stringUtil = new StringUtil();
        
     /*   String strA = "Cuộc đời vẫn đẹp sao";
      
        String strB = "đời";

        // if (strA.contains(strB)) {
        // System.out.println("\"" + strA + "\" chứa \"" + strB + "\"");
        // } else {
        // System.out. System.out.println("\"" + strA + "\" không chứa \"" + strB +
        // "\"");
        // }
       

        boolean isContain = stringUtil.isContain(strA, strB);

        if (isContain) {
            System.out.println(strA + " có chứa " + "\"" + strB + "\"");
        } else {
            System.out.println(strA + " không chứa " + "\"" + strB + "\"");
        }

        System.out.println(" Nhập chuỗi bạn muốn đảo ngược : ");
        String str = "đảo ngược nè";
        System.out.println("chuỗi " + "\"" + str + "\"" + " đảo ngược lại là: ");
        String reverse = stringUtil.reverse(str);
        System.out.println("\"" + reverse + "\"");

        System.out.println(" Nhập chuỗi bạn muốn kiểm tra: ");
        String strC = "Cuộc đời vẫn đẹp sao";
        System.out.println(" Nhập phần tử bạn muốn kiểm tra vị trí: ");
        String strD = "đẹp";
        int find = stringUtil.find(strC, strD);
        System.out.println(" Kết quả: ");
        System.out.println(find);

        System.out.println(" Nhập chuỗi mà bạn muốn in hoa chữ cái đầu của mỗi phần tử: ");
        String input = "in hoa chữ đầu tiên";
        String camelCase = stringUtil.camelCase(input);
        System.out.println(" Kết quả là: ");
        System.out.println(camelCase); 
        
        String strE = "Không có gì quý hơn độc lập tự do";
        System.out.println("chu dai nhat cua day " + "\"" + strE + "\"" + " la: ");
        String longestWord = stringUtil.longestWord(strE);
        System.out.println("\"" + longestWord + "\""); */

        String strF = "Một con mèo, hai con chó, chó đuổi mèo";
        System.out.println("so lan xuat hien cua moi tu trong doan van" + strF + " la: ");
        Map<String, Integer> map = stringUtil.countWords(strF);
        for (String i : map.keySet() ) {
            System.out.println( "Tu " + i + " co so lan xuat hien la " + map.get(i));
        }

    }
}