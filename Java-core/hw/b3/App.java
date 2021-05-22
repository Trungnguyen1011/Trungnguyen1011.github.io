public class App {
    public static void main(String[] args) {
        Logic logic = new Logic();
        System.out.println("Bài 2: Tư vấn Sức khỏe");
        logic.heathcare();
        System.out.println();
        System.out.println();
        System.out.println("Bài 3: Kiểm tra mẫu email");
        logic.emailChecker();
        System.out.println();
        System.out.println();
        System.out.println("Bài 4: Nhập một số nguyên dương, tìm các số nguyên tố từ 0 tới nó: ");
        logic.primeNumbers();

    }

}