public enum Type {
    FOOD("Thực phẩm"), FASHION("Thời trang"), HOUSEWARE("Đồ gia dụng"), BEAUTY("Mỹ phẩm");

    private String value;
    
    Type(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
