public enum Status {
    GOOD ("Tốt"), NORMAL("1 vài vết xước không đáng kể"), BAD("Hư hỏng nhẹ, có trang rách"), WORST("Hỏng mất nhiều trang");
private String value;

Status(String value) {
    this.value = value;
}
public String getValue() { return value; }
}
