import java.util.Scanner;

public class SGK extends Book implements IKho, IMuon{
    private int pageNumber;
    private Status status;
    private int totalAmount;
    private int rentingAmount;
    private int available;
    private String location;

    public SGK(Long id, String title, String publisher, String publishedYear, int pageNumber, Status status,
            int totalAmount, int rentingAmount) {
        super(id, title, publisher, publishedYear);
        this.pageNumber = pageNumber;
        this.status = status;
        this.totalAmount = totalAmount;
        this.rentingAmount = rentingAmount;

    }

    public int getPageNumber() {
        return pageNumber;
    }

    public void setPageNumber(int pageNumber) {
        this.pageNumber = pageNumber;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public int getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(int totalAmount) {
        this.totalAmount = totalAmount;
    }

    public int getRentingAmount() {
        return rentingAmount;
    }

    public void setRentingAmount(int rentingAmount) {
        this.rentingAmount = rentingAmount;
    }

    public int getAvailable() {
        return getTotalAmount() - getRentingAmount();
    }

    public void setAvailable(int available) {
        this.available = available;
    }

    public String getLocation() {
        return "Ha Noi";
    }

    public void setLocation(String location) {
        this.location = location;
    }

    @Override
    public void input() {
        Scanner input = new Scanner(System.in);
        super.input();
        System.out.println("Nhập số trang: ");
        pageNumber = input.nextInt();
        System.out.println("Nhập tình trạng: ");
        statusMenu();
        int status = input.nextInt();
        statusUpdate(status);
        System.out.println("Nhập tổng số lượng: ");
        totalAmount = input.nextInt();
        System.out.println("Nhập số đã cho mượn: ");
        rentingAmount = input.nextInt();
    }

    public void available(){
        this.available = (getTotalAmount() - getRentingAmount());
    }
    public void location(){
    this.location = "Ha Noi";
    }
    
    public void statusUpdate(int status) {

        switch (status) {
            case 1:
                this.status = Status.GOOD;
                break;
            case 2:
                this.status = Status.NORMAL;
                break;
            case 3:
                this.status = Status.BAD;
                break;
            case 4:
                this.status = Status.WORST;
                break;

            default:
                break;
        }
    }

    public void statusMenu() {
        System.out.println(
                "Chon 1: Tốt - Chon 2: 1 vài vết xước không đáng kể \nChon 3: Hư hỏng nhẹ, có trang rách - Chon 4: Hỏng mất nhiều trang. ");
    }

    public SGK() {

    }

    @Override
    public String toString() {
        return super.toString() + "Số trang: " + pageNumber + " - Số lượng đẫ được mượn: " + rentingAmount + " - Tình trạng: "
                + status.getValue() + " - Tổng số lượng: " + totalAmount +  " - Hàng tồn: " + getAvailable() + " - Kho: " + getLocation() + ".\n";
    }


}
