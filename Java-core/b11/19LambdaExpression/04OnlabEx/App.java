import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class App {
    public static void main(String[] args) {
        ReadFile readFile = new ReadFile();
        readFile.getProduct();
        List<Product> listProduct = readFile.listProduct;
        // 1 lambda
        space();
        System.out.println("Danh sách sản phẩm: \n");
        print(listProduct);
        space();
        System.out.println("Sắp xếp theo tên: \n");

        Collections.sort(listProduct, (o1, o2) -> {
            return o1.getName().compareTo(o2.getName());
        });
        print(listProduct);
        space();
        System.out.println("Sắp xếp theo số lượng bán được: \n");
        Collections.sort(listProduct, (o1, o2) -> {
            return o1.getAmountSale() - (o2.getAmountSale());
        });
        print(listProduct);
        space();
        System.out.println("Sản phầm có mức giá trên 1.000.000: \n");
        listProduct.stream().filter(price -> price.getPrice() > 1000000).forEach(price -> System.out.println(price));
        space();

        // 2 comparators

        space();
        System.out.println("Sắp xếp theo tên (comparators): \n");
        Collections.sort(listProduct, new Comparator<Product>() {

            @Override
            public int compare(Product o1, Product o2) {

                return o1.getName().compareTo(o2.getName());
            }
        });
        print(listProduct);
        space();
        System.out.println("Sắp xếp theo số lượng bán được (comparators): \n");
        Collections.sort(listProduct, new Comparator<Product>() {

            @Override
            public int compare(Product o1, Product o2) {

                return o1.getAmountSale() - (o2.getAmountSale());
            }
        });
        print(listProduct);
        space();

        System.out.println("Sản phầm có mức giá trên 1.000.000 (comparators): \n");
        for (Product product : listProduct) {
            if (product.getPrice() > 1000000) {
                System.out.println(product);
            } else {
                continue;
            }
        }
        space();
        System.out.println("Tổng số tiền bán được của mỗi sản phẩm: \n");
        Map<String, Integer> totalSale = new HashMap<String, Integer>();

        listProduct.stream().forEach(
                product -> totalSale.put(product.getName(), (int) (product.getPrice() * product.getAmountSale())));
        totalSale.forEach((key, value) -> System.out.println("Sản phẩm: " + key + ": Tổng thu: " + value + "vnd"));

    }

    static void space() {
        System.out.println("\n-----------------------------------------------------------------------\n");
    }

    static void print(List<Product> t) {
        t.forEach(Print -> System.out.println(Print));
    }
}