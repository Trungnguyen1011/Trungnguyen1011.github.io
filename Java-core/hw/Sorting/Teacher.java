public class Teacher extends Person {
    private String salary;
    
    public Teacher (Long id, String name, String age, String mobile, String address, String email, String salary) {
     super(id, name, age, mobile, address, email, salary);
     setSalary(salary);
    }

    public String getSalary() {
        return salary;
    }

    public void setSalary(String salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Teacher [address=" + address + ", age=" + age + ", email=" + email + ", id=" + id + ", mobile=" + mobile
                + ", name=" + name + ", salary=" + getSalary() + "]";
    }
}