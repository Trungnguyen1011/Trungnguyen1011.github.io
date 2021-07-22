
//Product(Long id, String name, Type type, Long amount, Long price, Long amountSold
public class App {
    public static void main(String[] args) {
        {
            Repository repo = new Repository();
        repo.add(new Product(1L, "Khoai Tây",Type.FOOD,40000L,2000L,15000L));
        repo.add(new Product(2L, "Trứng gà",Type.FOOD,200000L,2500L,60000L));
        repo.add(new Product(3L, "Mũ Nike Vendor",Type.FASHION,700L,165000L,60L));
        repo.add(new Product(4L, "Máy sưởi Sunhouse",Type.HOUSEWARE,300L,400000L,45L));
        repo.add(new Product(5L, "Lò Vi Sóng Điện Tử Bluestone",Type.HOUSEWARE,200L,1350000L,25L));
        repo.add(new Product(6L, "Sữa rửa mặt La Roche Posay",Type.BEAUTY,1500L,350000L,90L));
            repo.menu();

        }
    }

    
}