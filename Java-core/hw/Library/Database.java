public class Database {
    public Repository<Customer> customerRepo;
    public Repository<Book> bookRepo;
    public Repository<RentalList> renderListRepo;
    public Repository<Author> authorRepo;

    public Database() {
        customerRepo = new Repository<>();
        bookRepo = new Repository<>();
        renderListRepo = new Repository<>();
        authorRepo = new Repository<>();
    }
}
