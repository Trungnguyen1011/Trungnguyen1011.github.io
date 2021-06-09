import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Logic {
    public List<String> emailList() {
        Scanner input = new Scanner(System.in);
        List<String> emailList = new ArrayList<String>();
        System.out.println("Hãy nhập vào các email bạn muốn kiểm tra, gõ \"q\" để hoàn thành: ");
        while (true) {
            String email = input.nextLine();
            if (email.equals("q")) {
                break;
            }
            emailList.add(email);
        }
        input.close();
        return emailList;

    }

    public void emailChecker(List<String> emailList) {
        for (int i = 0; i < emailList.size(); i++) {
            Pattern mail = Pattern.compile("\\w+@\\w+[.]\\w+");
            Matcher matcher = mail.matcher(emailList.get(i));
            boolean matchFound = matcher.find();
            if (matchFound) {
                System.out.println("Đây là email: " + emailList.get(i));
            } else {
                System.out.println("Đây không phải là email: " + emailList.get(i));
            }
        }
    }

}
