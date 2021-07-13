import java.util.Scanner;

public class DoAn extends Book implements IKho{
    private int pageNumber;
    private Status status;
    private String date;
    private String location;

    
    public DoAn(Long id, String title, String publisher, String publishedYear, int pageNumber, Status status,
            String date) {
        super(id, title, publisher, publishedYear);
        this.pageNumber = pageNumber;
        this.status = status;
        this.date = date;
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
    public String getDate() {
        return date;
    }
    public void setDate(String date) {
        this.date = date;
    }
    
public String getLocation() {
        return "Sai Gon";
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
        String a = input.nextLine();
        System.out.println("Nhập ngày bảo vệ: ");
        date = input.nextLine();
        
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
    public void location() {
        this.location = "Sai Gon";
    }
public DoAn() {
    
}
    public void statusMenu() {
        System.out.println(
                "Chon 1: Tốt - Chon 2: 1 vài vết xước không đáng kể \nChon 3: Hư hỏng nhẹ, có trang rách - Chon 4: Hỏng mất nhiều trang. ");
    }



    @Override
    public String toString() {
        return super.toString() + "Ngày bảo vệ: " + date + " - Số trang: " + pageNumber + " - Tình trạng: " + status.getValue() + " - Kho: " + getLocation() +".\n";
    }

    
}
