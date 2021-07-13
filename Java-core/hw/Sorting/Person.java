public abstract class Person {
    protected Long id;
    protected String name;
    protected String age;
    protected String mobile;
    protected String address;
    protected String email;
    protected String variable;

    public Person(Long id, String name, String age, String mobile, String address, String email, String variable) {
        setId(id);
        setName(name);
        setAge(age);
        setMobile(mobile);
        setAddress(address);
        setEmail(email);
        setVariable(variable);
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getVariable() {
        return variable;
    }

    public void setVariable(String variable) {
        this.variable = variable;
    }

}
