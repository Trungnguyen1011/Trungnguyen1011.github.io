public class QualityChecker extends Employee {
    private Long bugCount;

    public QualityChecker(Long id, String name, String age, String phone, String email, String salary, Long bugCount) {
        super(id, name, age, phone, email, salary);
        this.bugCount = bugCount;
    }
    
    public Long getBugCount() {
        return bugCount;
    }

    public void setBugCount(Long bugCount) {
        this.bugCount = bugCount;
    }

    public int getIncome() {
        return Integer.valueOf(getSalary()) + 50*(getBugCount().intValue());
    }

    @Override
    public String toString() {
        return "Quality Checker: " + super.toString() + ", bugCount: " + bugCount + ", Earned: " + getIncome() +" ]";
    }

    
}