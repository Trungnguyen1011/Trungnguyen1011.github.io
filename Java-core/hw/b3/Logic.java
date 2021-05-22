import java.util.Scanner;
import java.util.regex.*;
import java.util.ArrayList;

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
            System.out.println("Chỉ số BMI của bạn là: " + bmiRating);

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
        Pattern mail = Pattern.compile("\\w+@\\w+[.]\\w+");
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
    }

    public void censorBadWords() {
        Scanner input = new Scanner(System.in);
        String[] badWords = { "fuck", "sex", "rape", "shit", "bitch", "damn" };
        String[] itsGoodNow = { "f*ck", "s*x", "r**e", "sh*t", "b*tch", "d*mn" };
        String para = input.nextLine();
        String[] censored = new String[badWords.length];

        if (true) {
            String replaceString = para.replace(badWords[0], itsGoodNow[0]);
            censored[0] = replaceString;
            for (int j = 1; j < badWords.length; j++) {
                String replaceBwords = censored[j - 1].replace(badWords[j], itsGoodNow[j]);
                censored[j] = replaceBwords;
                if (j == badWords.length - 1) {
                    System.out.println(censored[j]);
                }
            }

        }
    }

    public void palindrome() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Chuỗi bạn muốn nhập có bao nhiêu từ: ");
        String slength = scanner.nextLine();
        int length = Integer.parseInt(slength);
        String[] array = new String[length];
        System.out.println("Nhập từ bạn muốn: ");
        for (int i = 0; i < length; i++) {
            array[i] = scanner.nextLine();
        }
        System.out.println("Chuỗi của bạn là: ");

        for (int i = 0; i < length; i++) {
            System.out.print(array[i] + ", ");
        }
        for (int i = 0; i < length; i++) {
            Pattern word = Pattern.compile("^(\\w)\\w+\\1$");
            Matcher matcher = word.matcher(array[i]);
            boolean matchFound = matcher.find();

            /*
             * if (matchFound == true) { boolean balance = true; } else { boolean balance =
             * false;
             * 
             * }
             */
            if (matchFound == false) {
                System.out.println("Nó không có các phần tử cân xứng.");
                break;
            } else if (i == length - 1 && matchFound == true) {
                System.out.println("Nó có các phần tử cân xứng.");
            } else {
                continue;
            }

        }
    }

    public void space() {
        System.out.println();
    }
}
