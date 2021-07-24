import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        boolean isContinue = true;
        Scanner scanner = new Scanner(System.in);
        Constroller repo = new Constroller();
        repo.getData();

        while (isContinue) {
            Menu.mainMenu();

            int choose = scanner.nextInt();
            switch (choose) {
                case 1:
                    repo.login();
                    break;
                case 2:
                    repo.createNewAccount();
                    break;
                case 0:
                    isContinue = false;
                    break;
                default:
                    break;
            }

        }
    }
}