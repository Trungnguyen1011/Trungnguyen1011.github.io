public class LineItem implements Entity {

  private Long id; // Unique id
  private Integer unitPrice;
  private Integer quantity;
  public Product product;

  public void setId(Long id) {
    this.id = id;
  }

  public Integer getCost() {
    return unitPrice * quantity;
  }

  @Override
  public Long getId() {
    return id;
  }

  public Integer getUnitPrice() {
    return unitPrice;
  }

  public void setUnitPrice(Integer unitPrice) {
    this.unitPrice = unitPrice;
  }

  public Integer getQuantity() {
    return quantity;
  }

  public void setQuantity(Integer quantity) {
    this.quantity = quantity;
  }

  public LineItem(Product product, Integer unitPrice, Integer quantity) {
    this.unitPrice = unitPrice;
    this.quantity = quantity;
    this.product = product;

  }

  @Override
  public String toString() {
    return "\n" + product + " quantity= " + quantity + ", unitPrice=" + unitPrice + ".000 vnd" + ", cost= "
        + getCost() + ".000 vnd \n";
  }
}
