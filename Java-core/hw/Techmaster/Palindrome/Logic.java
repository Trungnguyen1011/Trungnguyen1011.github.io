import java.util.ArrayList;
import java.util.Scanner;

public class Logic {
    public void palindrome() {
        Scanner input = new Scanner(System.in);

        ArrayList<String> arrayList = new ArrayList<String>();
        System.out.println("Nhập những từ bạn muốn, nhấn q để kết thúc nhập từ: ");
        int i = 0;
        while (true) {
            arrayList.add(input.nextLine());
            String quit = arrayList.get(i);
            if (quit.equals("q")) {
                arrayList.remove(i);
                break;
            }
            i++;

        }
        System.out.println("Chuỗi của bạn là: ");
        for (int j = 0; j < arrayList.size(); j++) {
            System.out.print(arrayList.get(j) + ", ");
        }

        for (int j = 0; j < arrayList.size(); j++) {
            String original = arrayList.get(j);
            String reverse = "";
            for (int n = original.length() - 1; n >= 0; n--) {
                reverse = reverse + original.charAt(n);
            }
            if (original.equals(reverse)) {
                if (j == arrayList.size() - 1) {
                    System.out.println("Nó có các kí tự cân xứng");
                }
            } else {
                System.out.println("Nó không có các kí tự cân xứng");
                break;
            }
        }
        input.close();
    }
}
