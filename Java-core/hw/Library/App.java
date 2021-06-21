import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

// Thực hiện mô phỏng web quản lý thư viện, biết để quản lý thư viện ta cần có
public class App {
        public static void main(String[] args) {
                Database data = new Database();
                // Khởi tạo khách hàng
                Customer trung = new Customer("Nguyen Thanh Trung", "0123456788", "nttorange@gmail.com", "Ha Noi Viet Nam");
                Customer minh = new Customer("Ho Anh Minh", "0564785416", "tthl334@gmail.com", "Ha Noi Viet Nam");
                Customer messi = new Customer("Lionel Messi", "2354978531", "ganhteamconglung@gmail.com", "Arghentina");

                data.customerRepo.add(trung);
                data.customerRepo.add(minh);
                data.customerRepo.add(messi);

                // Khởi tạo tác giả 
                Author danielLang = new Author("Y. Daniel Liang", "1983", "y.danielliang@gmail.com", "11935 Abercorn Street Savannah, Georgia");
                Author jKRowling = new Author("J. K. Rowling", "1997", "jrowling@scholastic.com", "Gloucestershire, England");
                Author peterLynch = new Author("Peter Lynch", "1968", "lynchinvestments@gmail.com", "Boston, Massachusetts, US");
                Author rothchild = new Author("John Harmon Rothchild", "1988", "rothchildmonry@gmail.com", "Washington DC , US");

                data.authorRepo.add(danielLang);
                data.authorRepo.add(jKRowling);
                data.authorRepo.add(peterLynch);
                data.authorRepo.add(rothchild);

                // Gán tác giả vào đàu sách
                List<Author> introductionToJavaAuthors = new ArrayList<Author>();
                List<Author> fantasticBeastsAuthors = new ArrayList<Author>();
                List<Author> onWallStreetAuthors = new ArrayList<Author>();

                introductionToJavaAuthors.add(danielLang);
                fantasticBeastsAuthors.add(jKRowling);
                onWallStreetAuthors.add(peterLynch);
                onWallStreetAuthors.add(rothchild);

                // Khởi tạo tạo đầu sách
                Book introductionToJava = new Book("Introduction to Java Programming", 
                                "November 1, 2002", introductionToJavaAuthors, "Prentice Hall", "992 pages");
                Book fantasticBeasts = new Book("Fantastic Beasts and Where to Find Them", 
                                "November 12 2001", fantasticBeastsAuthors, "Bloomsbury", "128 pages");
                Book onWallStreet = new Book("One Up On Wall Street: How To Use What You Already Know To Make Money In The Market",
                                "April 3, 2000", onWallStreetAuthors, "Simon & Schuster", "304 pages");
                                
                data.bookRepo.add(introductionToJava);
                data.bookRepo.add(fantasticBeasts);
                data.bookRepo.add(onWallStreet);
               
                // Khởi tạo Lineitem
                LineItem trungrent1 = new LineItem(onWallStreet, 3, 20);
                LineItem trungrent2 = new LineItem(fantasticBeasts, 1, 40);
                LineItem trungrent3 = new LineItem(introductionToJava, 2, 60);

                List<LineItem> list1 = new ArrayList<LineItem>();
                list1.add(trungrent1);
                list1.add(trungrent2);
                list1.add(trungrent3);

                //Khởi tạo phiếu
                RentalList rentaList1 = new RentalList(trung, LocalDate.now(), LocalDate.of(2021, 9, 30), "doc sach mua dich", list1);

                // In
                List<Customer> customers = data.customerRepo.getAll();
                for (Customer customer : customers) {
                        System.out.println(customer);
                }
                System.out.println("");

                List<Author> authors = data.authorRepo.getAll();
                for (Author author : authors) {
                        System.out.println(author);
                }
                System.out.println("");

                List<Book> books = data.bookRepo.getAll();
                for (Book book : books) {
                        System.out.println(book + "\n");
                }
                System.out.println("");

                System.out.println(rentaList1);
        }

}