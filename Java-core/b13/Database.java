import java.util.Scanner;

public class Database {
    protected Repository<Book> bookRepo;
    protected Repository<SGK> sachGiaoKhoaRepo;
    protected Repository<TaiLieuDienTu> taiLieuRepo;
    protected Repository<DoAn> doAnRepo;
   
    public Database() {
        bookRepo = new Repository<Book>();
        sachGiaoKhoaRepo = new Repository<SGK>();
        taiLieuRepo = new Repository<>();
        doAnRepo = new Repository<>();
    }

    SGK tempSGK = new SGK();
    DoAn tempDoAn = new DoAn();
    TaiLieuDienTu tempTaiLieu = new TaiLieuDienTu();
    public void directAddData() {
        int i = typeOfInput();
        switch (i) {
             case 1:
             tempSGK.input();
             sachGiaoKhoaRepo.addData(tempSGK);
             break;
             case 2:
             tempDoAn.input();
             doAnRepo.addData(tempDoAn);
             break;
             case 3: 
             tempTaiLieu.input();
             taiLieuRepo.addData(tempTaiLieu);
             break;
             default: 
             break;
         }
     }
 
     public int typeOfInput() {
         Scanner input = new Scanner(System.in);
         System.out.printf("\nChọn loại sách muốn thêm mới: \n1: %s\n2: %s\n3: %s ","Sách giáo khoa.","Đồ án.","Tài liệu điện tử");
         int i = input.nextInt();
         return i;   
     }
}
