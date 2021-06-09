import java.util.Scanner;

public class Logic {
    public void guessNumber() {
        Scanner scanner = new Scanner(System.in);

        int number = (int) ((Math.random()) * 100);
        while (true) {
            float x = scanner.nextFloat();
            if (number == x) {
                System.out.println("Tuyệt bạn đoán đúng rồi");
                break;
            } else if (x < number) {
                System.out.println("Số bạn gõ vào nhỏ quá");
            } else {
                System.out.println("Số bạn gõ vào lớn quá");
            }

        }
        scanner.close();

    }

}