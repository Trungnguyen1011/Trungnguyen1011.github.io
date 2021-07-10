public enum ProdType {
   // Điện thoại, Laptop, Appe, Phụ kiện


PHONE("Điện thoại"), LAPTOP("Laptop"), APPLE("Apple"), ACCESSORIES("Phụ kiện");

private String value;

ProdType(String value) {
    this.value = value;
}

public String getValue() {
    return value;
}




}
