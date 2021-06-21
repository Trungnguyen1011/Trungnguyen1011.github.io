import java.time.LocalDateTime;
import java.util.List;

public class RentalList implements Entity {

    private Long id;
    private Customer customer;
    private LocalDateTime orderDate;
    private String notes; // Ghi chú khi đặt hàng
    private List<LineItem> items; // chi tiết từng mặt hàng trong đơn hàng
    private Long totalCost = 0L;

    public void setId(Long id) {
        this.id = id;
    }

    @Override
    public Long getId() {
        return id;
    }

    public RentalList(Customer customer, LocalDateTime orderDate, String notes, List<LineItem> items) {
        id = IdGenerator.getNewRenderListId();
        this.customer = customer;
        this.orderDate = orderDate;
        this.notes = notes;
        this.items = items;
        totalCost = 0L;
        for (LineItem item : items) {
            totalCost += item.getCost();
        }
    }

    @Override
    public String toString() {
        return "Rental List [id: " + id + "\n " + customer + "\n items= \n " + items + "\n notes= " + notes
                + "\n orderDate= " + orderDate + "\n Total Cost= " + getTotalCost() + " usd ]";
    }

    public Long getTotalCost() {
        return totalCost;
    }

    public void setTotalCost(Long totalCost) {
        this.totalCost = totalCost;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public LocalDateTime getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(LocalDateTime orderDate) {
        this.orderDate = orderDate;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    public List<LineItem> getItems() {
        return items;
    }

    public void setItems(List<LineItem> items) {
        this.items = items;
    }

}
