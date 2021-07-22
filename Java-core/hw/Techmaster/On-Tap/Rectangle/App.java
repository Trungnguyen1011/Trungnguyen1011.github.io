import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Nhập chiều dài: ");
        int chieuDai = input.nextInt();

        System.out.println("Nhập chiều rộng: ");
        int chieuRong = input.nextInt();

        for (int i = 0; i < chieuRong; i++) {
            for (int j = 0; j < chieuDai; j++) { System.out.print("* ");}
            System.out.println("");
        }
    }
}