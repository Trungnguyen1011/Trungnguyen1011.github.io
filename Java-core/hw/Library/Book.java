import java.util.List;
// Sách: chứa thông tin về sách như: (Mã sách, tên sách, thể loại, tác giả, năm
// sản xuất, nhà sản xuất, số trang)

public class Book implements Entity {
    private Long id;
    public String bookName;
    public String publishedYear;
    public List<Author> authors;
    public String publisher;
    public String paperBack;

    public Book(String bookName, String publishedYear, List<Author> authors, String publisher, String paperBack) {
        id = IdGenerator.getNewbookId();
        this.bookName = bookName;
        this.publishedYear = publishedYear;
        this.authors = authors;
        this.publisher = publisher;
        this.paperBack = paperBack;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Override
    public String toString() {
        String sortedAuthors = "";
        for (Author author : authors) {
            sortedAuthors += author + "\n ";
        }
        return "Book [id= " + id + "\n" + " Author= \n " + sortedAuthors + "bookName= " + bookName + "\n paperBack= "
                + paperBack + "\n publishedYear= " + publishedYear + "\n publisher= " + publisher + "]";
    }

}
