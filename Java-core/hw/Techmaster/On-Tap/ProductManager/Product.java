public class Product {
    //mã, tên sản phẩm, loại sản phẩm (Thức ăn, đồ gia dụng, thời trang, mĩ phẩm, ...), số lượng, giá bán, số lượng bán
    private Long id;
    private String name;
    private Type type;
    private Long amount;
    private Long price;
    private Long amountSold;

    
    public Product(Long id, String name, Type type, Long amount, Long price, Long amountSold) {
        this.id = id;
        this.name = name;
        this.type = type;
        this.amount = amount;
        this.price = price;
        this.amountSold = amountSold;
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
    public Type getType() {
        return type;
    }
    public void setType(Type type) {
        this.type = type;
    }
    public Long getAmount() {
        return amount;
    }
    public void setAmount(Long amount) {
        this.amount = amount;
    }
    public Long getPrice() {
        return price;
    }
    public void setPrice(Long price) {
        this.price = price;
    }
    public Long getAmountSold() {
        return amountSold;
    }
    public void setAmountSold(Long amountSold) {
        this.amountSold = amountSold;
    }
    @Override
    public String toString() {
        return "Id: " + id +", Name: " + name + ", Type: " + type.getValue() + ", Amount: " + 
        amount +", Amount: "+ amount + ", Price: " + price + ", Sold Amount: " + amountSold;
    }

    
}
