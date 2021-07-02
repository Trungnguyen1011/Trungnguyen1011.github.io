

public class  Database {
    public static Repository<Customer> customerRepo;
    public static Repository<Account> accountRepo;
   

    public Database() {
        customerRepo = new Repository<>();
        accountRepo = new Repository<>();
    }
}
