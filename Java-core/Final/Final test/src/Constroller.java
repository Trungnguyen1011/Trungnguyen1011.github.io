import java.util.NoSuchElementException;
import java.util.Scanner;

public class Constroller extends Repository {
    protected Long loginId;
    boolean isLogged = false;
    IdGenerator idgen = new IdGenerator();
    public void login() {
        Scanner input = new Scanner(System.in);
        boolean isContinue = true;
        while (isContinue) {
            System.out.println("Nhấn q để quay lại: ");
            System.out.println("Nhập username: ");
            String username = input.nextLine();
            if (username.equals("q")) {
                break;
            }
            System.out.println("Nhập mật khẩu:");
            String password = input.nextLine();
            if (password.equals("q")) {
                break;
            }
            int count = 0;
            for (User user : users) {
                if (username.equals(user.getUsername())) {
                    count++;
                    if (password.equals(user.getPassword())) {
                        loginId = user.getId();
                        isLogged = true;
                        System.out.println("Đăng nhập thành công, Xin chào " + user.getUsername());
                       

                        while (isLogged) {
                            loginController();
                        }
                        isContinue = false;
                        break;
                    } else {
                        loginFail();
                        break;
                    }
                }

            }
            if (count == 0) {
                System.out.println("Kiểm tra lại username.\n");
            }
        }
    }

    public void loginFail() {
        Scanner input = new Scanner(System.in);
        Menu.loginFailMenu();
        int choice = input.nextInt();
        switch (choice) {
            case 1:
                break;
            case 2:
                forgotPassword();
                break;
            default:
                break;
        }

    }

    public void changePassword() {
        Scanner input = new Scanner(System.in);
        System.out.println("Nhập mật khẩu mới: ");
        String newPassword = input.nextLine();
        users.stream().filter(user -> user.getId() == loginId).findFirst().get().setPassword(newPassword);

        System.out.println("Đổi mật khẩu mới thành công.");

    }

    public void changeUsername() {
        Scanner input = new Scanner(System.in);
        System.out.println("Nhập username mới: ");
        String newUsername = input.nextLine();
        users.stream().filter(user -> user.getId() == loginId).findFirst().get().setUsername(newUsername);

        System.out.println("Đổi username mới thành công.");

    }

    public void changeEmail() {
        Scanner input = new Scanner(System.in);
        System.out.println("Nhập email mới: ");
        String newEmail = input.nextLine();
        users.stream().filter(user -> user.getId() == loginId).findFirst().get().setEmail(newEmail);

        System.out.println("Đổi email mới thành công.");

    }

    public void forgotPassword() {
        boolean isExisted = false;
        Scanner input = new Scanner(System.in);
        while (true) {
            System.out.println("Nhập Email đăng ký: ");
            System.out.println("Nhấn q để quay lại: ");
            String emailReg = input.nextLine();
            if (emailReg.equals("q")) {
                break;
            }
            try {
                User forgotten = users.stream().filter(user -> user.getEmail().equals(emailReg)).findFirst().get();
                isExisted = true;
                loginId = forgotten.getId();
                changePassword();
                loginId = null;
                break;

            } catch (NoSuchElementException e) {
                System.out.println("Tài khoản không tồn tại.");
            }


        }

    }

    public void createNewAccount() {
        Scanner input = new Scanner(System.in);
        Long id = idgen.getNewId();
        System.out.println("Bắt đầu đăng ký, mời bạn nhập thông tin: ");
        System.out.println("Nhập username: ");
        String username = input.nextLine();
        System.out.println("Nhập password: ");
        String password = input.nextLine();
        System.out.println("Nhập email: ");
        String email = input.nextLine();
        users.add(new User(id, username, email, password));
        System.out.println("Đăng ký thành công.");
        
    }

    public void loginController() {
        boolean isContinue = true;
        Scanner input = new Scanner(System.in);
        while (isContinue) {
            Menu.loginMenu();
            int choice = input.nextInt();
            switch (choice) {
                case 1:
                    changeUsername();
                    break;
                case 2:
                changeEmail();
                    break;
                case 3:
                    changePassword();
                    break;
                case 4:
                    loginId = null;
                    isContinue = false;
                    isLogged = false;
                    System.out.println("Đăng xuất thành công. \n \n");
                    break;
                case 0:
                    isContinue = false;
                    isLogged = false;
                    break;
                default:
                    break;
            }
        }
    }

}
