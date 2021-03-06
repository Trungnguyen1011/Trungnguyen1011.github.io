public class Employee {
  //  mã nhân viên, họ tên, tuổi, số điện thoại, email, lương cơ bản,
    private Long id;
    private String name;
    private String age;
    private String phone;
    private String email;
    private String salary;

    
    public Employee(Long id, String name, String age, String phone, String email, String salary) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.phone = phone;
        this.email = email;
        this.salary = salary;
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
    public String getAge() {
        return age;
    }
    public void setAge(String age) {
        this.age = age;
    }
    public String getPhone() {
        return phone;
    }
    public void setPhone(String phone) {
        this.phone = phone;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getSalary() {
        return salary;
    }
    public void setSalary(String salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "[Id: "+ id + ", Name: " + name +", Age: " + age + ", Phone: " + phone + ", Email: " + email + ", Salary: " + salary;
    }
    

}
