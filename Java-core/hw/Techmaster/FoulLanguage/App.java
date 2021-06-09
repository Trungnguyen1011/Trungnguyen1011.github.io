import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        Logic logic = new Logic();

        System.out.println("Nhập chuỗi bạn muốn lọc từ xấu: ");
        Scanner input = new Scanner(System.in);
        String para = input.nextLine();
        System.out.println(logic.censorBadWords(para));
        input.close();
    }
}
