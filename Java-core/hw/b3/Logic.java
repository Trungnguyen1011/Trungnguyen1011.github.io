import java.util.Scanner;
import java.util.regex.*;

public class Logic {

    public void heathcare() {
        Scanner input = new Scanner(System.in);
        while (true) {
            System.out.println("Nhập vào cân nặng và chiều cao của bạn: ");
            System.out.println("Cân nặng tính bằng kg: ");
            Float weight = input.nextFloat();
            System.out.println("Chiều cao tính bằng m: ");
            Float height = input.nextFloat();

            float bmiRating = (weight / (height * height));

            if (height.equals("q") || weight.equals("q")) {
                break;
            } else if (bmiRating <= 24.9) {
                if (bmiRating < 18.5) {
                    System.out.println("Bạn đang hơi nhẹ cân, cần ăn uống đầy đủ hơn cũng như sinh hoạt điều độ");
                } else {
                    System.out.println("Thể trạng của bạn hoàn toàn bình thường, hãy giữ vững phong độ.");
                }
            } else if (bmiRating < 30) {
                System.out.println("Bạn đang hơi thừa cân, cần xem lại chế độ dinh dưỡng và vận động nhiều hơn.");
            } else {
                System.out.println(
                        "Rất có thể bạn đang gặp vấn đề về sức khỏe, hãy xem lại chế độ dinh dưỡng cũng như tích cực vận động hơn, hãy nhờ đến sự trợ giụp của y tế khi cảm thấy cần thiết");
            }
            break;
        }

    }

    public void emailChecker() {
        Scanner input = new Scanner(System.in);
        System.out.println("Hãy nhập email của bạn vào đây: ");
        String email = input.nextLine();
        String mailfrom = ("@|mail.");
        Pattern mail = Pattern.compile(mailfrom);
        Matcher matcher = mail.matcher(email);
        boolean matchFound = matcher.find();
        if (email != "q") {
            if (matchFound) {
                System.out.println("Cảm ơn bạn");
            } else {
                System.out.println("Xin hãy nhập đúng mẫu email có @ và tên miền (gmail.com, outlook.com,.. etc");
            }
        }

    }

    public void primeNumbers() {
        Scanner input = new Scanner(System.in);
        System.out.println("Hãy nhập 1 số nguyên dương nhỏ hơn 100: ");
        int maxNumber = input.nextInt();
        int i;
        int u;
        if (maxNumber < 100 && maxNumber > 0) {
            System.out.println("Các số nguyên dương từ 0 tới " + maxNumber + " là: ");
            for (i = 2; i <= maxNumber; i++) {
                for (u = 2; u <= maxNumber; u++) {
                    boolean Prime;
                    if (i > u) {
                        if (i % u != 0) {
                            Prime = true;
                        } else {
                            Prime = false;
                            break;
                        }
                    } else

                    if (Prime = true && i == u) {
                        System.out.print(i + ", ");

                    } else {
                        break;
                    }
                }
            }

        } else {
            System.out.println("Số này lớn hơn 100.");
        }
        input.close();
    }
}
