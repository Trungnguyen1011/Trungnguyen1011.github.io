public class Person {
    private String name;
    private String nationality;
    private Long age;
    
    public Person(String name, String nationality, Long age) {
        this.name = name;
        this.nationality = nationality;
        this.age = age;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getNationality() {
        return nationality;
    }
    public void setNationality(String nationality) {
        this.nationality = nationality;
    }
    public Long getAge() {
        return age;
    }
    public void setAge(Long age) {
        this.age = age;
    }
    @Override
    public String toString() {
        return "Person [ name= " + name + ", nationality= " + nationality +  ", age= " + age + "]";
    }

    
}
