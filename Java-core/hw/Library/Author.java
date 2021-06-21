public class Author implements Entity {
    private Long id;
    public String authorName;
    public String experience;
    public String email;
    private String address;

    public Author(String authorName, String experience, String email, String address) {
        id = IdGenerator.getNewAuthorId();
        this.authorName = authorName;
        this.experience = experience;
        this.email = email;
        setAddress(address);
    }

    @Override
    public String toString() {
        return "Author [id= " + id + ", authorName= " + authorName + ", experience since= " + experience + ", email= "
                + email + ", address= " + address +  "]";
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

}
