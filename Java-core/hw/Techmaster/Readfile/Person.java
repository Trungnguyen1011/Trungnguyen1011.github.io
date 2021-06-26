public class Person {
    private Long id;
    private String first_name;
    private String last_name;
    private String gender;
   
    private String date_of_birth;
    private String country;

public Person(Long id, String first_name, String last_name,String gender ,String date_of_birth, String country  ) {
    setId(id);
    setFirst_name(first_name);
    setLast_name(last_name);
    setGender(gender);
    setDate_of_birth(date_of_birth);
    setCountry(country);
}

    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getFirst_name() {
        return first_name;
    }
    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }
    public String getLast_name() {
        return last_name;
    }
    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }
    public String getGender() {
        return gender;
    }
    public void setGender(String gender) {
        this.gender = gender;
    }
    public String getDate_of_birth() {
        return date_of_birth;
    }
    public void setDate_of_birth(String date_of_birth) {
        this.date_of_birth = date_of_birth;
    }
    public String getCountry() {
        return country;
    }
    public void setCountry(String country) {
        this.country = country;
    }
 
    public String getFull_name() {
        return first_name + last_name;
    }
   
    @Override
    public String toString() {
        return "Id: " + id + " ,Name: " + getFull_name() + " ,Gender: " + 
        gender + " ,Date of birth: " + date_of_birth + " ,Country: " + country;
    }
}
