import java.util.Scanner;

public class Controller extends Repo {
    String theChosenOne;

    public void menu() {
        Scanner input = new Scanner(System.in);

        boolean isContinue = true;
        while (isContinue) {
            appMenu();
            int choose = input.nextInt();
            switch (choose) {
                case 1:
                    int choose1 = input.nextInt();
                    cataFilter(choose1);
                    break;
                case 2:
                    int choose2 = input.nextInt();
                    brandFilter(choose2);
                    break;
                case 3:
                    int choose3 = input.nextInt();
                    CataPriceFilter(choose3);
                    int choose4 = input.nextInt();
                    priceFilter(choose4, theChosenOne);
                    break;
                case 4:
                    String choose5 = input.nextLine();
                    customFilter(choose5);
                    break;
                case 0:
                    System.out.println("Cảm ơn bạn đã sử dụng dịch vụ.");

                    isContinue = false;
                    break;
                default:
                    break;

            }

        }
        input.close();
    }

    public void appMenu() {
        System.out.println("\nMời chọn tiện ích: ");
        System.out.println("Bấm 1 In thông tin dựa trên danh mục.");
        System.out.println("Bấm 2 In thông tin các sản phẩm dựa theo hãng");
        System.out.println("Bấm 3 In thông tin sản phẩm dựa trên mức giá và danh mục.");
        System.out.println("Bấm 4 để tìm kiếm theo tên.");
        System.out.println("Bấm 0 để thoát.");
    }

    public void cataFilter(int choose) {
            System.out.println("Mời chọn danh mục:");
        System.out.println("1: Điện Thoại.");
        System.out.println("2: Laptop.");
        System.out.println("3: Apple.");
        System.out.println("4: Phụ kiện.");
        switch (choose) {
            case 1:
                super.productList.stream().filter(product -> product.getType() == Category.PHONE)
                        .forEach(product -> System.out.println(product));
                break;
            case 2:
                super.productList.stream().filter(product -> product.getType() == Category.LAPTOP)
                        .forEach(product -> System.out.println(product));
                break;
            case 3:
                super.productList.stream().filter(product -> product.getType() == Category.APPLE)
                        .forEach(product -> System.out.println(product));
                break;
            case 4:
                super.productList.stream().filter(product -> product.getType() == Category.ACCESSORIES)
                        .forEach(product -> System.out.println(product));
                break;
            default:
                break;
        }

    }

    public void brandFilter(int choose) {
               System.out.println("Mời chọn hãng:");
        System.out.println("1: Oppo.");
        System.out.println("2: Samsung.");
        System.out.println("3: Apple.");
        System.out.println("4: Xiaomi.");
        System.out.println("5: Dell");
        System.out.println("6: Asus");
        System.out.println("7: Vivo");
              switch (choose) {
            case 1:
                super.productList.stream().filter(product -> product.getBrand().equals("OPPO"))
                        .forEach(product -> System.out.println(product));
                break;
            case 2:
                super.productList.stream().filter(product -> product.getBrand().equals("Samsung"))
                        .forEach(product -> System.out.println(product));
                break;
            case 3:
                super.productList.stream().filter(product -> product.getBrand().equals("Apple"))
                        .forEach(product -> System.out.println(product));
                break;
            case 4:
                super.productList.stream().filter(product -> product.getBrand().equals("Xiaomi"))
                        .forEach(product -> System.out.println(product));
                break;
            case 5:
                super.productList.stream().filter(product -> product.getBrand().equals("Dell"))
                        .forEach(product -> System.out.println(product));
                break;
            case 6:
                super.productList.stream().filter(product -> product.getBrand().equals("Asus"))
                        .forEach(product -> System.out.println(product));
                break;
            case 7:
                super.productList.stream().filter(product -> product.getBrand().equals("Vivo"))
                        .forEach(product -> System.out.println(product));
                break;
            default:
                break;
        }
        ;

    }

    public void CataPriceFilter(int choose) {
        System.out.println("Mời chọn danh mục:");
        System.out.println("1: Điện Thoại.");
        System.out.println("2: Laptop.");
        System.out.println("3: Apple.");
        System.out.println("4: Phụ kiện.");
    
        System.out.println("Mời chọn mức giá:");
        System.out.println("1: Dưới 2 triệu");
        System.out.println("2: Từ 2 - 4 triệu");
        System.out.println("3: Từ 4 - 7 triệu");
        System.out.println("4: Từ 7 - 13 triệu");
        System.out.println("5: Trên 13 triệu");
        switch (choose) {
            case 1:
                theChosenOne = Category.PHONE.getValue();
                break;
            case 2:
                theChosenOne = Category.LAPTOP.getValue();
                break;
            case 3:
                theChosenOne = Category.APPLE.getValue();
                break;
            case 4:
                theChosenOne = Category.ACCESSORIES.getValue();
                break;
            default:

        }
        

    }

    public void priceFilter(int choose, String category) {
        switch (choose) {
            case 1:
                System.out.println("1: Dưới 2 triệu");
                super.productList.stream().filter(
                        product -> product.getPrice() < 2000000 && theChosenOne.equals(product.getType().getValue()))
                        .forEach(product -> System.out.println(product));
                break;
            case 2:
                System.out.println("2: Từ 2 - 4 triệu");
                super.productList.stream()
                        .filter(product -> product.getPrice() > 2000000 && product.getPrice() < 4000000
                                && theChosenOne.equals(product.getType().getValue()))
                        .forEach(product -> System.out.println(product));
                break;
            case 3:
                System.out.println("3: Từ 4 - 7 triệu");
                super.productList.stream()
                        .filter(product -> product.getPrice() > 4000000 && product.getPrice() < 7000000
                                && theChosenOne.equals(product.getType().getValue()))
                        .forEach(product -> System.out.println(product));
                break;
            case 4:
                System.out.println("4: Từ 7 - 13 triệu");
                super.productList.stream()
                        .filter(product -> product.getPrice() > 7000000 && product.getPrice() < 13000000
                                && theChosenOne.equals(product.getType().getValue()))
                        .forEach(product -> System.out.println(product));
                break;
            case 5:
                System.out.println("5: Trên 13 triệu");
                super.productList.stream().filter(
                        product -> product.getPrice() > 13000000 && theChosenOne.equals(product.getType().getValue()))
                        .forEach(product -> System.out.println(product));
                break;
            default:
                break;
        }
        ;

    }

    public void customFilter(String keywords) {
        System.out.println("Nhập tên sản phẩm cần tìm");
        super.productList.stream().filter(product -> (product.getName().toLowerCase()).contains(keywords.toLowerCase()))
                .forEach(product -> System.out.println(product));
    }

}
