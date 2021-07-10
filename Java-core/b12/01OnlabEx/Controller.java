import java.util.Scanner;

public class Controller extends Repo{
    public void menu() {
        Scanner input = new Scanner(System.in);
        System.out.println("Mời chọn tiện ích: ");
        System.out.println("Bấm 1 In thông tin dựa trên danh mục.");
        System.out.println("Bấm 2 In thông tin các sản phẩm dựa theo hãng");
        System.out.println("Bấm 3 In thông tin sản phẩm dựa trên mức giá và danh mục.");
        System.out.println("Bấm 4 để tìm kiếm theo tên.");
        int choose = input.nextInt();
    
        switch (choose) {
            case 1: 
            super.getData().stream().sorted().forEach(product -> System.out.println(product));
            break;
            case 2:
            submenu2();
            int choose2 = input.nextInt();
            switch (choose2) {
                case 1: 
                super.productList.stream().filter(product -> product.getBrand().equals("OPPO")).forEach(product -> System.out.println(product));
                break;
                case 2:
                super.productList.stream().filter(product -> product.getBrand().equals("Samsung")).forEach(product -> System.out.println(product));
                break;
                case 3:
                super.productList.stream().filter(product -> product.getBrand().equals("Apple")).forEach(product -> System.out.println(product));
                break;
                case 4:
                super.productList.stream().filter(product -> product.getBrand().equals("Xiaomi")).forEach(product -> System.out.println(product));
                break;
                case 5:
                super.productList.stream().filter(product -> product.getBrand().equals("Dell")).forEach(product -> System.out.println(product));
                break;
                case 6:
                super.productList.stream().filter(product -> product.getBrand().equals("Asus")).forEach(product -> System.out.println(product));
                break;
                case 7:
                super.productList.stream().filter(product -> product.getBrand().equals("Vivo")).forEach(product -> System.out.println(product));
                break;
                default: 
            System.out.println("Không có hãng này.");
            };
            break;
            case 3:
            submenu3();
            int choose3 = input.nextInt();
            switch (choose3) {
                case 1:
                System.out.println("1: Dưới 2 triệu");
                super.productList.stream().filter(product -> product.getPrice() < 2000000).forEach(product -> System.out.println(product)); 
                break;
                case 2:
                System.out.println("2: Từ 2 - 4 triệu");
                super.productList.stream().filter(product -> product.getPrice() > 2000000 && product.getPrice() <4000000).forEach(product -> System.out.println(product));
                break;
                case 3:
                System.out.println("3: Từ 4 - 7 triệu");
                super.productList.stream().filter(product -> product.getPrice() > 4000000 && product.getPrice() < 7000000).forEach(product -> System.out.println(product));
                break;
                case 4:
                System.out.println("4: Từ 7 - 13 triệu");
                super.productList.stream().filter(product -> product.getPrice() > 7000000 && product.getPrice()< 13000000).forEach(product -> System.out.println(product));
                break;
                case 5:
                System.out.println("5: Trên 13 triệu");
                super.productList.stream().filter(product -> product.getPrice()> 13000000).forEach(product -> System.out.println(product));
                break;
                default: System.out.println("Vui lòng chọn mức giá");
            };
     
            default: 
            System.out.println("Không có tiện ích này.");
        }

        
    }

    public void submenu1(){ 
        System.out.println("Mời chọn danh mục sắp xếp");
        System.out.println("1: Tên.");
        System.out.println("2: Giá.");
        System.out.println("3: Hãng.");
    }

    public void submenu2(){
        System.out.println("Mời chọn hãng:");
        System.out.println("1: Oppo.");
        System.out.println("2: Samsung.");
        System.out.println("3: Apple.");
        System.out.println("4: Xiaomi.");
        System.out.println("5: Dell");
        System.out.println("6: Asus");
        System.out.println("7: Vivo");
      
        }

        public void submenu3() {
         System.out.println("Mời chọn mức giá:");
        System.out.println("1: Dưới 2 triệu");
        System.out.println("2: Từ 2 - 4 triệu");
        System.out.println("3: Từ 4 - 7 triệu");
        System.out.println("4: Từ 7 - 13 triệu");
        System.out.println("5: Trên 13 triệu");
    
        }

}
