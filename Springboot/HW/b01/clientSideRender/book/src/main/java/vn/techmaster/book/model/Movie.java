package vn.techmaster.book.model;

public class Movie {
    private String title;
    private String director;
    private Long publishedYear;
    public Movie(String title, String director, Long publishedYear) {
        this.title = title;
        this.director = director;
        this.publishedYear = publishedYear;
    }
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public String getDirector() {
        return director;
    }
    public void setDirector(String director) {
        this.director = director;
    }
    public Long getPublishedYear() {
        return publishedYear;
    }
    public void setPublishedYear(Long publishedYear) {
        this.publishedYear = publishedYear;
    }
    
}
