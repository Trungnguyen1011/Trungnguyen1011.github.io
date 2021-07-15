public class Database {
    protected Repository<Coder> coders;
    protected Repository<QualityChecker> qCers;

    public Database() {
        this.coders = new Repository<Coder>();
        this.qCers = new Repository<QualityChecker>();
    }
}