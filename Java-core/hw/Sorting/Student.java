public class Student extends Person {
    private String score;
    
    public Student (Long id, String name, String age, String mobile, String address, String email, String score) {
     super(id, name, age, mobile, address, email, score);
     setScore(score);
    }

    public String getScore() {
        return score;
    }

    public void setScore(String score) {
        this.score = score;
    }

    @Override
    public String toString() {
        return "Student [address=" + address + ", age=" + age + ", email=" + email + ", id=" + id + ", mobile=" + mobile
                + ", name=" + name + ", score=" + getScore() + "]";
    }

}