import java.util.Scanner;

public class Menu {
    public void Menu() {
        Login login = new Login();
        Scanner input = new Scanner(System.in);
        AccountFunction accountFunction = new AccountFunction();
        login.Login();
        if (login.isLoginAuthorities()) {
            System.out.println("Dang nhap thanh cong: \nXin chao " + accountFunction.getCustommerName());
            System.out.println("Chon tien ich ban muon: ");
            System.out.println("1: Xem so du tai khoan.");
            System.out.println("2: Chuyen tien.");
            System.out.println("3: Dang xuat.");
            int choice = input.nextInt();
            switch (choice) {
                case 1: 
                accountFunction.getBalance();
                break;
                case 3: 
                login.LogOut();
                break;
                default: 
                System.out.println("khong co tien ich nay");
            }
        }
input.close();

    }
}
