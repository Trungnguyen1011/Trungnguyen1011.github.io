import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class App {
        public static void main(String[] args) {
                // Thực hiện mô phỏng web quản lý thư viện, biết để quản lý thư viện ta cần có
                // các thông tin sau:
                // Phiếu thuê (Mã phiếu, độc giả, ngày thuê, ngày hẹn trả, line item)
                Database data = new Database();
                Customer trung = new Customer("Nguyen Thanh Trung", "0123456788", "nttorange@gmail.com",
                                "Ha Noi Viet Nam");
                Customer minh = new Customer("Ho Anh Minh", "0564785416", "tthl334@gmail.com", "Ha Noi Viet Nam");
                Customer messi = new Customer("Lionel Messi", "2354978531", "ganhteamconglung@gmail.com", "Arghentina");
                data.customerRepo.add(trung);
                data.customerRepo.add(minh);
                data.customerRepo.add(messi);

                Author danielLang = new Author("Y. Daniel Liang", "1983", "y.danielliang@gmail.com",
                                "11935 Abercorn Street Savannah, Georgia");
                Author jKRowling = new Author("J. K. Rowling", "1997", "jrowling@scholastic.com",
                                "Gloucestershire, England");
                Author peterLynch = new Author("Peter Lynch", "1968", "lynchinvestments@gmail.com",
                                "Boston, Massachusetts, US");
                Author rothchild = new Author("John Harmon Rothchild", "1988", "rothchildmonry@gmail.com",
                                "Washington DC , US");
                data.authorRepo.add(danielLang);
                data.authorRepo.add(jKRowling);
                data.authorRepo.add(peterLynch);
                data.authorRepo.add(rothchild);

                List<Author> introductionToJavaAuthors = new ArrayList<Author>();
                List<Author> fantasticBeastsAuthors = new ArrayList<Author>();
                List<Author> onWallStreetAuthors = new ArrayList<Author>();
                introductionToJavaAuthors.add(danielLang);
                fantasticBeastsAuthors.add(jKRowling);
                onWallStreetAuthors.add(peterLynch);
                onWallStreetAuthors.add(rothchild);

                Book introductionToJava = new Book("Introduction to Java Programming", "November 1, 2002",
                                introductionToJavaAuthors, "Prentice Hall", "992 pages");
                Book fantasticBeasts = new Book("Fantastic Beasts and Where to Find Them", "2001",
                                fantasticBeastsAuthors, "Bloomsbury", "128 pages");
                Book onWallStreet = new Book(
                                "One Up On Wall Street: How To Use What You Already Know To Make Money In The Market",
                                "April 3, 2000", onWallStreetAuthors, "Simon & Schuster", "304 pages");
                data.bookRepo.add(introductionToJava);
                data.bookRepo.add(fantasticBeasts);
                data.bookRepo.add(onWallStreet);

                LineItem trungrent1 = new LineItem(onWallStreet, 3, 20);
                LineItem trungrent2 = new LineItem(fantasticBeasts, 1, 40);
                LineItem trungrent3 = new LineItem(introductionToJava, 2, 60);

                List<LineItem> list1 = new ArrayList<LineItem>();
                list1.add(trungrent1);
                list1.add(trungrent2);
                list1.add(trungrent3);

                RentalList rentaList1 = new RentalList(trung, LocalDate.now(), LocalDate.of(2021, 6, 30),
                                "doc sach mua dich", list1);

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