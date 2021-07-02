import java.util.List;

public class AccountFunction {
    private Account accountLoggedIn;
    
    public void findTheAccount() { 
        List<Account> accounts = Database.accountRepo.getAll();
        for (Account i: accounts) {
            if (i.getId() == Login.idLoggedIn) {
               this.accountLoggedIn = i;
            }
 
        }
    }
    public String getCustommerName() {
        findTheAccount();
        return accountLoggedIn.getCustomer().getName();
    }

    public Long getBalance() {
        findTheAccount();
        return accountLoggedIn.getAccountBalance();
    }
    public void transferMoney() {
        findTheAccount();
        System.out.println("Nhap stk ban muon chuyen tien toi: ");
    }
}
