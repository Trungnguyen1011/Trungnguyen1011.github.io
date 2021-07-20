public class Customer {
    private String id;
    private String name;
    private String birthday;
    private Gender gender;
    private String places;
    private String mobile;
    private String email;

    public Customer(String id, String name, String birthday, Gender gender, String places, String mobile,
            String email) {
        setId(id);
        this.name = name;
        this.birthday = birthday;
        this.gender = gender;
        this.places = places;
        setMobile(mobile);
        setEmail(email);
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = Validation.validateId(id);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public String getPlaces() {
        return places;
    }

    public void setPlaces(String places) {
        this.places = places;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = Validation.validateMobile(mobile);
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = Validation.validateEmail(email);
    }

    @Override
    public String toString() {
        return "Id: " + id + ", name: " + name + ", birthday: " + birthday + ", " + gender.getValue() + ", places: " + places
                + ", mobile: " + mobile + ", email: " + email;
    }

}
