import java.util.Scanner;

public class App {
    class MyMath {
        public boolean isTriangle(double x, double y, double z) {
            if ( (x+y) > z) {
                return true;
            } else { return false; }
        }
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
       MyMath logic = new App().new MyMath();
        System.out.println("Hãy nhập độ dài các cạnh bạn muốn kiểm tra: ");
        System.out.println("Cạnh 1: ");
        double x = input.nextDouble();
        System.out.println("Cạnh 2: ");
        double y = input.nextDouble();
        System.out.println("Cạnh 3: ");
        double z = input.nextDouble();
        input.close();
        System.out.println("Kết quả là: " + logic.isTriangle(x, y ,z));


    }
}