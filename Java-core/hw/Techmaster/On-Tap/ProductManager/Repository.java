import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Repository {
    Scanner input = new Scanner(System.in);
    List<Product> list = new ArrayList<Product>();
    Long totalAmount = 0L;

    public void viewAll() {
        list.forEach(product -> System.out.println(product));
    }

    public void add(Product product) {
        list.add(product);
    }

    public void searchById(Long id) {
        Iterator itr = list.iterator();
        while (itr.hasNext()) {
            Product product = (Product) itr.next();
            if (product.getId() == id) {
                idController(product);
            }
        }
    }

    public void idController(Product product) {
        System.out.println("Bấm 1 để sửa: ");
        System.out.println("Bấm 2 để xóa: ");
        int choice = input.nextInt();
        input.nextLine();
        switch (choice) {
            case 1:
                edit(product);
                break;
            case 2:
                delete(product);
                break;
            default:
                break;
        }

    }

    public Type typeChoice(int value) {

        Type[] array = { Type.FOOD, Type.FASHION, Type.HOUSEWARE, Type.BEAUTY };
        return array[value - 1];
    }
    public Product dataInput() {
        System.out.println("Nhập id: ");
        Long id = input.nextLong();
        input.nextLine();
        System.out.println("Nhập tên: ");
        String name = input.nextLine();

        System.out.println("Nhập loại: ");
        System.out.println("1: Thực phẩm\n2: Thời trang\n3: Đồ gia dụng\n4:Mỹ phẩm");
        int type = input.nextInt();
        while (type < 1 || type > 4) {
            System.out.println("Mời chọn lại. ");
            type = input.nextInt();
        }
        Type productType = typeChoice(type);
        System.out.println("Nhập số lượng: ");
        Long amount = input.nextLong();
        System.out.println("Nhập giá: ");
        Long price = input.nextLong();
        System.out.println("Nhập số lượng đã bán: ");
        Long amountSold = input.nextLong();
        return new Product(id, name, productType, amount, price, amountSold);
    }
    public void edit(Product product) {

        boolean isContinue = true;

        while (isContinue) {
            System.out.println("Chọn thông tin muốn sửa: ");
            System.out.println("1: id.");
            System.out.println("2: name.");
            System.out.println("3: type.");
            System.out.println("4: amount.");
            System.out.println("5: Long price.");
            System.out.println("6: amountSold.");
            System.out.println("0: Kết thúc sửa.");
            int choice2 = input.nextInt();
            input.nextLine();
            switch (choice2) {
                case 1:
                    Long id = input.nextLong();
                    product.setId(id);

                    break;
                case 2:
                    String name = input.nextLine();
                    product.setName(name);
                    break;
                case 3:
                    System.out.println("1: Food.");
                    System.out.println("2: Fashion.");
                    System.out.println("3: Houseware.");
                    System.out.println("4: Beauty.");
                    int value = input.nextInt();

                    product.setType(typeChoice(value));
                    break;
                case 4:
                    Long amount = input.nextLong();
                    product.setAmount(amount);
                    break;
                case 5:
                    Long price = input.nextLong();
                    product.setPrice(price);
                    break;
                case 6:
                    Long amountSold = input.nextLong();
                    product.setAmountSold(amountSold);
                    break;
                case 0:
                    isContinue = false;
                    break;
                default:
                    break;
            }
        }

    }

    public void delete(Product product) {
        list.remove(product);
    }

    public void viewSold() {
        Map<String, Integer> soldList = new HashMap<String, Integer>();
        list.forEach(product -> soldList.put(product.getName(), (int) (long) product.getAmountSold()));
        soldList.forEach((k, v) -> System.out.println(k + ": " + v));
    }

    public void viewByType() {
       
        for (int i = 1; i < 5; i++) {
            totalAmount = 0L;
            Object typeChosen = typeChoice(i);
            list.stream().filter(product -> product.getType() == typeChosen)
                    .forEach(product -> totalAmount += product.getAmount());
            System.out.println(typeChoice(i).getValue() + ": " + totalAmount);
        }

    }

    public void sortByName() {
        list.stream().sorted((o1, o2) -> o1.getName().compareTo(o2.getName()))
                .forEach(product -> System.out.println(product));
    }
    public void menu() {
        boolean isContinue = true;
        
        while(isContinue) {
            System.out.println(
                "1 - Xem sản phẩm\n2 - Thêm mới sản phẩm\n3 - Tìm sản phẩm theo mã sản phẩm\n4 - Xem sản phẩm và số lượng bán được (Sử dụng Map)\n5 - Liệt kê loại sản phẩm và số lượng sản phẩm thuộc loại đó\n6 - Sắp xếp sản phẩm theo tên"
                );
                System.out.println("0 - Thoát Chương trình");
            int choicee = input.nextInt();
        switch(choicee) {
            case 1:
            viewAll();
            break;
            case 2:
            add(dataInput());
            break;
            case 3:
            System.out.println("Nhập mã sản phẩm cần tìm: ");
            Long searchId = input.nextLong();
            searchById(searchId);
            break;
            case 4:
            viewSold();
            break;
            case 5:
            viewByType();
            break;
            case 6:
            sortByName();
            break;
            case 0:
            isContinue = false;
            break;
            default:
            break;
        }}
            }
}
