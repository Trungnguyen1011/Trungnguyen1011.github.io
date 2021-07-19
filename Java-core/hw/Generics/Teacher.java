public class Teacher extends Person {
    private String salary;

    public Teacher(Long id, String name, String salary) {
        super(id, name);
        this.salary = salary;
    }

    public String getSalary() {
        return salary;
    }

    public void setSalary(String salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return super.toString() + ", salary: " + salary + ".";
    }

}
