import java.util.List;

public class App {
    public static void main(String[] args) {

    Controller repo = new Controller();
    repo.productList.add(new Product(1L , "Oppo Reno5 8GB,128GB" ," Oppo Reno5 8GB,128GB" , 8390000L , 10L , 7L ,"OPPO" , ProdType.PHONE));
    repo.productList.add(new Product(2L , "Oppo Reno4 Pro" , "Oppo Reno4 Pro" , 11490000L , 25L , 10L , "OPPO" , ProdType.PHONE));
    repo.productList.add(new Product(3L ," Samsung Galaxy Z Flip" , "Samsung Galaxy Z Flip" , 20990000L , 10L , 3L , "Samsung" , ProdType.PHONE));
    repo.productList.add(new Product(4L , "Oppo A92" , "Oppo A92" , 5990000L , 30L , 15L , "OPPO" , ProdType.PHONE));
    repo.productList.add(new Product(5L ," Asus Zenbook UX325EA,EG079T" , "Asus Zenbook UX325EA,EG079T" , 20790000L , 10L , 6L , "Asus" , ProdType.LAPTOP));
    repo.productList.add(new Product(6L , "Dell G3 15 i5 10300H" , "Dell G3 15 i5 10300H" , 21840000L , 15L , 4L , "Dell" , ProdType.LAPTOP));
    repo.productList.add(new Product(7L , "Dell Inspiron N7501 i7 10750H" , "Dell Inspiron N7501 i7 10750H" , 28970000L , 10L , 1L , "Dell" , ProdType.LAPTOP));
    repo.productList.add(new Product(8L , "iPhone 12 Pro Max 128GB" , "iPhone 12 Pro Max 128GB" , 30990000L, 5L , 2L , "Apple" , ProdType.APPLE));
    repo.productList.add(new Product(9L , "MacBook Air 13 2020 M1 16GB/256GB" , "MacBook Air 13 2020 M1 16GB/256GB" , 33990000L , 20L , 4L , "Apple" , ProdType.APPLE));
    repo.productList.add(new Product(10L , "Loa bluetooth Compact 2" , "Loa bluetooth Compact 2" , 290000L , 20L , 15L , "Xiaomi" , ProdType.ACCESSORIES));
    repo.productList.add(new Product(11L , "Loa bluetooth i.value BT116" , "Loa bluetooth i.value BT116" , 490000L , 30L , 10L , "i.value" , ProdType.ACCESSORIES));
    repo.productList.add(new Product(12L , "Pin sạc dự phòng 10000mAh Mi Ultra Compact" , "Pin sạc dự phòng 10000mAh Mi Ultra Compact" , 710000L , 30L , 10L ," Xiaomi" , ProdType.ACCESSORIES));
    repo.productList.add(new Product(13L , "Vivo Y20 4GB,64GB" ," Vivo Y20 4GB,64GB" , 3690000L , 15L , 10L , "Vivo" , ProdType.PHONE));
    repo.productList.add(new Product( 14L , "Xiaomi Redmi 9 4GB,64GB" , "Xiaomi Redmi 9 4GB,64GB ", 3190000L , 30L , 25L ," Xiaomi" , ProdType.PHONE));
    repo.menu();
       

}


}