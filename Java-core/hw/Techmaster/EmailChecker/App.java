import java.util.List;

public class App {

    public static void main(String[] args) {
        Logic logic = new Logic();
        List<String> emailList = logic.emailList();
        logic.emailChecker(emailList);
    }
}
