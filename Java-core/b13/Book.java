import java.util.Scanner;

public class Book {
   private Long id;
    private String title;
    private String publisher;
    private String publishedYear;

    public Book(Long id, String title, String publisher,String publishedYear) {
      
        this.id = id;
        this.title = title;
        this.publisher = publisher;
        this.publishedYear = publishedYear;
    }
   
    public void input(){
        Scanner input = new Scanner(System.in);
        System.out.println("Nhập mã sách: ");
        id = input.nextLong();
        String a = input.nextLine();
        System.out.println("Nhập tiêu đề: ");
        title = input.nextLine();
        System.out.println("Nhập nhà xuất bản: ");
        publisher = input.nextLine();
        System.out.println("Nhập năm xuất bản: ");
        publishedYear = input.nextLine();
         }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public String getPublishedYear() {
        return publishedYear;
    }

    public void setPublishedYear(String publishedYear) {
        this.publishedYear = publishedYear;
    }

    @Override
    public String toString() {
        return "Mã sách: " + id + " - Tiêu đề: " + title + " - Năm xuất bản: " + publishedYear + " - Nhà Xuất bản: " + publisher + ".\n";
    }
    
    public Book() {

    }
}
