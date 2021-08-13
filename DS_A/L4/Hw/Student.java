public class Student implements Comparable<Student> {
    private Long id;
    private String name;
    
    public Student(Long id, String name) {
        this.id = id;
        this.name = name;
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
    @Override
    public String toString() {
        return "Stt: " + id + " - Tên: " + name;
    }
    @Override
    public int compareTo(Student o) {
        return 0;
    }

    
    
}
