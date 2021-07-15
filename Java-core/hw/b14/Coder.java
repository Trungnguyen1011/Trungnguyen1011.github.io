public class Coder extends Employee {
    private Long overWorkTime;

    public Coder(Long id, String name, String age, String phone, String email, String salary, Long overWorkTime) {
        super(id, name, age, phone, email, salary);
        this.overWorkTime = overWorkTime;
    }

    public Long getOverWorkTime() {
        return overWorkTime;
    }

    public void setOverWorkTime(Long overWorkTime) {
        this.overWorkTime = overWorkTime;
    }

    public int getIncome() {
        return Integer.valueOf(getSalary()) + 200*(getOverWorkTime().intValue());
    }
    @Override
    public String toString() {
        return "Coder: " + super.toString() + ", Over Work Time: " + overWorkTime + ", Earned: " + getIncome() +" ]";
    }

    
}
