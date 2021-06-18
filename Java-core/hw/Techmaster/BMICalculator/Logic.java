import java.util.Scanner;

public class Logic {
    public void heathcare() {
        Scanner input = new Scanner(System.in);
        while (true) {
            System.out.println("Nhập vào cân nặng và chiều cao của bạn nhấn \"q\" để thoát: ");
            System.out.println("Cân nặng tính bằng kg: ");
            String weight = input.nextLine();
            if (weight.equals("q")) {
                break;
            }
            System.out.println("Chiều cao tính bằng m: ");
            String height = input.nextLine();
            if (height.equals("q")) {
                break;
            }

            float x = Float.valueOf(weight);
            float y = Float.valueOf(height);
            float bmiRating = (x / y * y);

            System.out.printf("Chỉ số BMI của bạn là: %.2f \n", bmiRating);
            if (bmiRating <= 24.9) {
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
        }
        input.close();
    }
}
