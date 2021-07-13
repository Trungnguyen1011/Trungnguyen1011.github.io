public class App {
  public static void main(String[] args) {
    Database db = new Database();

    SGK sgk1 = new SGK(3L, "Tiếng Việt", "Kim Đồng", "2021", 72, Status.GOOD, 1000, 500);
    TaiLieuDienTu tailieu1 = new TaiLieuDienTu(4L, "Tài liệu Java", "Kim Tiền", "300", "500mb", 500L, 20L);

    db.sachGiaoKhoaRepo.addData(sgk1);
    db.taiLieuRepo.addData(tailieu1);
    System.out.println("Trước khi sửa: \n");
    db.sachGiaoKhoaRepo.printData();
    db.sachGiaoKhoaRepo.updateData(sgk1);
    System.out.println("Sau khi sửa: \n");
    System.out.println("Danh sách: \n");
    db.sachGiaoKhoaRepo.printData();
    db.taiLieuRepo.printData();
    db.doAnRepo.printData();

  }
}