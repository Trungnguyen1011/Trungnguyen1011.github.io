public class App {
    public static void main(String[] args) {
        Logic logic = new Logic();

        System.out.println("Bài 2: Tư vấn Sức khỏe");
        logic.heathcare();
        logic.space();
        System.out.println("Bài 3: Kiểm tra mẫu email");
        logic.emailChecker();
        logic.space();
        System.out.println("Bài 4: Nhập một số nguyên dương, tìm các số nguyên tố từ 0 tới nó: ");
        logic.primeNumbers();
        logic.space();
        System.out.println("Bài 5.1: Hãy nhập 1 chuỗi từ xem kí tự đầu và cuối của chúng có giống nhau: ");
        logic.palindrome();
        logic.space();
        System.out.println("Bài 5.2: Đoạn văn này sẽ bị censor từ nóng, không tin cứ thử xem: ");
        logic.censorBadWords();

    }

}