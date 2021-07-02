import java.util.List;
import java.util.Scanner;

public class Login {
    private String username;
    private String password;
    private Customer customer;
    private Account account;
    private static boolean isLoginAuthorities = false;
    protected static Long idLoggedIn;

    public void Login() {
        isLoginAuthorities = true ;
        List<Account> checkList = Database.accountRepo.getAll();
        Scanner input = new Scanner(System.in);
        Boolean valid = false;
        int count = 0;
        while (count <= 5 || valid == false) {
            System.out.println("Nhaajp so dien thoai: ");
            String username = input.nextLine();
            System.out.println("Nhaajp mat khau: ");
            String password = input.nextLine();
            for (Account i : checkList) {
                if (username.equals(i.getUsernames()) && password.equals(i.getPassword())) {
                    valid = true;
                    idLoggedIn = i.getId();
                    count = 5;
                    break;
                  
                }
            }
            
            count++;
        }
        input.close();
        if (!valid){ isLoginAuthorities = false;} 
       
    }

    public void LogOut() {
        isLoginAuthorities = false;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public Account getAccount() {
        return account;
    }

    public void setAccount(Account account) {
        this.account = account;
    }

    public boolean isLoginAuthorities() {
        return isLoginAuthorities;
    }

  

}
