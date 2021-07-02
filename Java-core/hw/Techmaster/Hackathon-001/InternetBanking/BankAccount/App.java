public class App {
    public static void main(String[] args) {
        Database db = new Database();
        Menu menu = new Menu();

        Customer trung = new Customer("Nguyen Thanh Trung", "10/11/1996", "0123456789", "Ha Noi");
        Customer trungClone = new Customer("Nguyen Thanh Trung Clone", "10/11/1996", "9876543210", "Ha Noi");
        Database.customerRepo.add(trung);
        Database.customerRepo.add(trungClone);
        Account trungAccount = new Account(trung, 500000L, "qwerty","11111111");
        Account trungCloneAccount = new Account(trungClone, 999L, "qwerty","22222222");
        Database.accountRepo.add(trungAccount);
        Database.accountRepo.add(trungCloneAccount);
        menu.Menu();
    }
}