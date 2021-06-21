// Độc giả: Chứa thông tin độc giả: (Mã độc giả, tên độc giả, email, số điện
// thoại, địa chỉ)
public class Customer implements Entity {

    private Long id;
    private String name;
    private String email;
    private String mobile;
    private String address;

    public Customer(String name, String mobile, String email, String address) {
        id = IdGenerator.getNewCustomerId();
        setName(name);
        setMobile(mobile);
        setEmail(email);
        setAddress(address);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = Validation.validateEmail(email);
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = Validation.validateMobile(mobile);
        ;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Customer [id= " + id + ", name= " + name + ", email= " + email + ", mobile= " + mobile + ", address= "
                + address + "]";
    }
}
