public class App {

    public static void main(String[] args) {
        Repository repo = new Repository();
        repo.getStudentsData();
        space();
        repo.getTeachersData();
    }
    public static void space() {
        System.out.println("\n--------------------------------------------------------------------------------------------------------------------------------------------------------\n");
    }
}