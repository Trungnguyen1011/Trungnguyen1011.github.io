import java.util.List;
// Sách: chứa thông tin về sách như: (Mã sách, tên sách, thể loại, tác giả, năm
// sản xuất, nhà sản xuất, số trang)

public class Book implements Entity {
    private Long id;
    public String bookName;
    public String publishedYear;
    public List<Author> author;
    public String publisher;
    public String paperBack;

    public Book(String bookName, String publishedYear, List<Author> author, String publisher, String paperBack) {
        id = IdGenerator.getNewbookId();
        this.bookName = bookName;
        this.publishedYear = publishedYear;
        this.author = author;
        this.publisher = publisher;
        this.paperBack = paperBack;
    }

    @Override
    public String toString() {
        return "Book [id= " + id + "\n" + "Author= " + author + "\n bookName= " + bookName +  "\n paperBack= " + paperBack
                + "\n publishedYear= " + publishedYear + "\n publisher= " + publisher + "]";
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
