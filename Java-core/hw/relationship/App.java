import java.util.List;
import java.util.Optional;
import java.util.Vector;
import java.time.LocalDateTime;
import java.util.ArrayList;

public class App {
  public static void main(String[] args) {

    Database db = new Database();
    Customer tom = new Customer("Tom", "tom@gmail.com", "0123456789", "Room 1101, Empire State, New York, USA");
    Customer bob = new Customer("Bob", "bob@gmail.com", "0223456788", "1 Láng Hạ");
    Customer alice = new Customer("Alice", "alice@gmail.com", "0323456788", "10 Trần Duy Hưng");
    db.customerRepo.add(tom);
    db.customerRepo.add(bob);
    db.customerRepo.add(alice);
    Product arisPro = new Product("Aris Pro", "VinSmart", Country.Vietnam, "Android 5G");
    Product maiWei = new Product("MaiWei", "Xiaomi", Country.China, "Thùng đựng đồ thông minh 35-55 lít");
    Product sUPHyper = new Product("SUP Hyper 12.6", "AquaMarina", Country.China, "SUP touring 12.6, 2 khoang");
    db.productRepo.add(arisPro);
    db.productRepo.add(maiWei);
    db.productRepo.add(sUPHyper);

    List<LineItem> tomList = new ArrayList<LineItem>();
    tomList.add(new LineItem(arisPro, 6000, 2));
    tomList.add(new LineItem(sUPHyper, 5, 24));
    db.productRepo.deleteProductByID(2L);
    Order order1 = new Order(tom, LocalDateTime.now(), "hello", tomList);
    db.orderRepo.add(order1);
    db.customerRepo.update(alice, 2L);


    List<Customer> customers = db.customerRepo.getAll();
    for (Customer customer : customers) {
      System.out.println(customer);
    }

    List<Product> products = db.productRepo.getAll();
    for (Product product : products) {
      System.out.println(product);
    }

    List<Order> orders = db.orderRepo.getAll();

    for (Order order : orders) {
      System.out.println(order);
    }
    Optional<Customer> oCustomer = db.customerRepo.findById(1L);
    if (oCustomer.isPresent()) {
      System.out.println(oCustomer.get());
    }
    long i, j;
    List<String> vector = new Vector<String>();
    vector.add("something");
    vector.add("someone");

    i = System.nanoTime();
    vector.add("some");
    j = System.nanoTime();
    System.out.println("Use Vector: " + (j - i));

    ArrayList<String> array = new ArrayList<String>();
    array.add("something");
    array.add("someone");
    i = System.nanoTime();
    array.add("some");
    j = System.nanoTime();
    System.out.println("Use Array: " + (j - i));

    
  }
}