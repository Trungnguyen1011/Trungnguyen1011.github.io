public class Team {
    @Override
    public String toString() {
        return "Team [name= " + name + ", stadium= " + stadium + ", coach= " + coach + ", established year= "
                + established_year + "]";
    }

    private String name;
    private String stadium;
    private String coach;
    private int established_year;

    public Team(String name, String stadium, String coach, int established_year) {
        this.name = name;
        this.stadium = stadium;
        this.coach = coach;
        this.established_year = established_year;
    }

}
