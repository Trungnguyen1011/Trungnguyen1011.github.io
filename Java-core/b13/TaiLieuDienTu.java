import java.util.Scanner;

public class TaiLieuDienTu extends Book implements Idownload {
    private String memory;
    private Long downloaded;
    private Long price;
    private Long earned;

    public TaiLieuDienTu(Long id, String title, String publisher, String publishedYear, String memory, Long downloaded,
            Long price) {
        super(id, title, publisher, publishedYear);
        this.memory = memory;
        this.downloaded = downloaded;
        this.price = price;
    }

    public TaiLieuDienTu() {

    }

    public String getMemory() {
        return memory;
    }

    public void setMemory(String memory) {
        this.memory = memory;
    }

    public Long getDownloaded() {
        return downloaded;
    }

    public void setDownloaded(Long downloaded) {
        this.downloaded = downloaded;
    }

    public Long getPrice() {
        return price;
    }

    public void setPrice(Long price) {
        this.price = price;
    }

    public Long getEarned() {
        return getDownloaded() * getPrice();
    }

    public void download() {
    }

    @Override
    public void input() {
        Scanner input = new Scanner(System.in);
        super.input();
        System.out.println("Nhập số lượt tải: ");
        downloaded = input.nextLong();
        System.out.println("Nhập giá: ");
        price = input.nextLong();
        String a = input.nextLine();
        System.out.println("Nhập dung lượng: ");
        memory = input.nextLine();
    }

    @Override
    public String toString() {
        return super.toString() + "Lượt tải: " + downloaded + " - Dung lượng: " + memory + " - Giá: " + price
                + " - Tổng thu: " + getEarned() + ".\n";
    }

}
