public class App {
    public static void main(String[] args) {
        Repository repo = new Repository();
        repo.addNew(new Customer("012345678","Nguyen Thanh Trung","10-11-1996",Gender.MALE,"Ha Noi","0903456789","Trung@gmail.com"));
        repo.addNew(new Customer("123456789","Thanh Trung Nguyen","11-10-1997",Gender.MALE,"Viet Nam","0389456378","Trung@yahoo.com"));
        repo.addNew(new Customer("234567890","Trung Nguyen Thanh","11-9-1998",Gender.MALE,"Earth","0374563985","Trung@outlook.com"));
        repo.menu();

    }
}