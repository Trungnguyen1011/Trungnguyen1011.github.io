public class Product {
    private Long id;
    private String name;
    private String description;
    private Long price;
    private Long amount;
    private Long amountSale;
    private String brand;
    private Category type;

    public Product(Long id, String name, String description, Long price, Long amount, Long amountSale, String brand,
            Category type) {
        setId(id);
        setName(name);
        setDescription(description);
        setPrice(price);
        setAmount(amount);
        setAmountSale(amountSale);
        setBrand(brand);
        setType(type);
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

    public Long getAmount() {
        return amount;
    }

    public void setAmount(Long amount) {
        this.amount = amount;
    }

    public Long getAmountSale() {
        return amountSale;
    }

    public void setAmountSale(Long amountSale) {
        this.amountSale = amountSale;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public Category getType() {
        return type;
    }

    public void setType(Category type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Sản phẩm: " + name + " - mã: " + id + " - Miêu tả: "+ description + " - Hãng sản xuất: " 
        + brand + " - Giá: " + price + " - Hàng còn: " + amount + " - Hàng đã bán: " + amountSale + " - Loại: " + type;
    }


}
