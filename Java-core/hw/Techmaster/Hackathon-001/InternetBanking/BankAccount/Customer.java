public class Customer implements Entity{
    private Long id;
    private String name;
    private String dateOfBirth;
    private String mobile;
    
    private String address;
    
    public Customer(String name, String dateOfBirth, String mobile,String address) {
    id = IdGenerator.getNewCustomerId();
    setName(name);
    setDateOfBirth(dateOfBirth);
    setMobile(mobile);
    setAddress(address);
 }

 public Long getId() {
    return id;
}

public void setId(Long id) {
    this.id = id;
}


 public String getName() {
    return name;
}

public void setName(String name) {
    this.name = name;
}

public String getDateOfBirth() {
    return dateOfBirth;
}

public void setDateOfBirth(String dateOfBirth) {
    this.dateOfBirth = dateOfBirth;
}

public String getMobile() {
    return mobile;
}

public void setMobile(String mobile) {
    this.mobile = mobile;
}

public String getAddress() {
    return address;
}

public void setAddress(String address) {
    this.address = address;
}


}