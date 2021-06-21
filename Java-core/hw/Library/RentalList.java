import java.time.LocalDateTime;
import java.time.LocalDate;
import java.util.List;

public class RentalList implements Entity {

    private Long id;
    private Customer customer;
    private LocalDate rentedDate;
    private LocalDate returnDate;
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

    public RentalList(Customer customer, LocalDate rentedDate, LocalDate returnDate, String notes,
            List<LineItem> items) {
        id = IdGenerator.getNewRenderListId();
        setCustomer(customer);
        setRentedDate(rentedDate);
        setNotes(notes);
        setItems(items);
        setReturnDate(returnDate);
        totalCost = 0L;
        for (LineItem item : items) {
            totalCost += item.getCost();
        }
    }

    public LocalDate getRentedDate() {
        return rentedDate;
    }

    public void setRentedDate(LocalDate rentedDate) {
        this.rentedDate = rentedDate;
    }

    public LocalDate getReturnDate() {
        return returnDate;
    }

    public void setReturnDate(LocalDate returnDate) {
        this.returnDate = returnDate;
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

    @Override
    public String toString() {
        return "Rental List [id: " + id + "\n " + customer + "\n items= \n " + items + "\n notes= " + notes
                + "\n rentedDate= " + rentedDate + "\n returnDate= " + returnDate + "\n Total Cost= " + getTotalCost()
                + " usd ]";
    }

}
