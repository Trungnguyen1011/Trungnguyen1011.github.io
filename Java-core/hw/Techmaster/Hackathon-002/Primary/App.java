import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Mời nhập số muốn kiểm tra.");
        System.out.println("Nhấn q hoặc x để thoát");
        boolean quit = false;
        while (!quit) {
            String inputData = input.nextLine();
            if (inputData.equals("q") || inputData.equals("x")) {
                quit = true;
                break;
            }
            int number = Integer.parseInt(inputData);
            int count = 0;
            for (int j = 2; j <= Math.sqrt(number); j++) {
                if (number % j == 0) {
                    count++;
                }
            }
            if (count == 0 && number > 1) {
                System.out.println("Đây là số nguyên tố.");
            } else {
                System.out.println("Đây không phải là số nguyên tố.");
            }

        }
    }
}
