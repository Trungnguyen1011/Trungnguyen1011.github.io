import java.util.regex.Matcher;
import java.util.regex.Pattern;

// Class check xem các cú pháp có hợp lệ hay không

public class Validation {
    public static final Pattern EmailRegex = Pattern.compile(
            "^[\\w!#$%&'*+/=?`{|}~^-]+(?:\\.[\\w!#$%&'*+/=?`{|}~^-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,6}$",
            Pattern.CASE_INSENSITIVE);
    // Case 1: pattern email: bắt đầu bằng bất kì kí tự chữ và số nào + kí tự đặc
    // biệt. Một hoặc nhiều lần
    // :? nghĩa là không phải group, non-capturing group.
    // \\. là bất kì kí tự nào ngoài xuống dòng (/n). Sau đó tiếp tục giống như dòng
    // case 1.
    // Rồi đến @ bắt buộc, sau đó là một non-capturing group với kí tự bắt buộc là
    // từ chữ hoặc số, có thể một hoặc nhiều ký tự
    // {2, 6} nghĩa là độ dài chuỗi ký tự là từ ít nhất = 2 và < 6. $ là dấu hiệu
    // đánh dấu hết dòng regex.

    public static final Pattern MobileRegex = Pattern.compile("^\\d{10,11}$");

    // Case 2: pattern của sdt. chỉ chấp nhận số, dài 10 số.
    private Validation() {
    }

    public static String validateEmail(String email) { // các hàm kiểm tra cú pháp
        Matcher matcher = EmailRegex.matcher(email);
        if (matcher.find()) {
            return email;
        } else {
            throw new RuntimeException("Email is not valid");
        }
    }

    public static String validateMobile(String mobile) { // các hàm kiểm tra cú pháp
        Matcher matcher = MobileRegex.matcher(mobile);
        if (matcher.find()) {
            return mobile;
        } else {
            throw new RuntimeException("Mobile is not valid. It must have 10 to 11 digits");
        }
    }

    public static String lengthBetween(String input, int... values) {
        if (values.length < 1 || values.length > 2) {
            throw new RuntimeException("You need to specify at least one parameter");
        }

        if (input.length() < values[0]) {
            throw new RuntimeException("Length of string must be longer than " + values[0]);
        }

        if (input.length() > values[1]) {
            throw new RuntimeException("Length of string must be less than " + values[1]);
        }
        return input;
    }
}
