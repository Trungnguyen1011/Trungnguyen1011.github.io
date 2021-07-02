public class Account implements Entity{
    private Long id;
    private Customer customer;
    private Long accountBalance;
    private String password;
    private String accountNumber;

    public Account(Customer customer, Long accountBalance, String password,String accountNumber ) {
        id = IdGenerator.getNewAccountId();
        setCustomer(customer);
        setAccountBalance(accountBalance);
        setPassword(password);
        setAccountNumber(accountNumber);
    }
    public String getAccountNumber() {
        return accountNumber;
    }
    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }
    
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public Long getAccountBalance() {
        return accountBalance;
    }

    public void setAccountBalance(Long accountBalance) {
        this.accountBalance = accountBalance;
    }

    public String getUsernames() {
        return customer.getMobile();
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
