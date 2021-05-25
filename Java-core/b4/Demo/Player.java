public class Player {
    @Override
    public String toString() {
        return "Player [name=" + name + ", no=" + no + ", position=" + position + "]";
    }

    private String name;
    private int no;
    private Position position;

    // constructor

    public Player(String name, int no, Position positon) {
        this.name = name;
        this.no = no;
        this.position = position;
    }
}
