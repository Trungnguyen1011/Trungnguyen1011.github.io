public class Product {
    private Long id;
    private String name;
    private String description;
    private Long price;
    private int amount;
    private int amountSale;

    public Product(Long id, String name, String description, Long price, int amount, int amountSale) {
        setId(id);
        setName(name);
        setDescription(description);
        setPrice(price);
        setAmount(amount);
        setAmountSale(amountSale);
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Long getPrice() {
        return price;
    }

    public void setPrice(Long price) {
        this.price = price;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public int getAmountSale() {
        return amountSale;
    }

    public void setAmountSale(int amountSale) {
        this.amountSale = amountSale;
    }

    @Override
    public String toString() {
        return "id: " + id + ", name: " + name + ", price: " + price + ", amount: " + amount + ", amountSale: " + amountSale + ", description: " + description;
    }

    
}