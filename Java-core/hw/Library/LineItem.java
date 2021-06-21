public class LineItem {

    private Integer rentingTime;
    private Integer price;
    public Book book;

    public LineItem(Book book, Integer price, Integer rentingTime) {
        this.price = price;
        this.rentingTime = rentingTime;
        this.book = book;

    }

    public Integer getCost() {
        return price * rentingTime;
    }

    public Integer getRentingTime() {
        return rentingTime;
    }

    public void setRentingTime(Integer rentingTime) {
        this.rentingTime = rentingTime;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return book + "\n price=" + price + " usd, rentingTime= " + rentingTime + " days, cost = " + getCost()
                + " usd]\n";
    }

}
