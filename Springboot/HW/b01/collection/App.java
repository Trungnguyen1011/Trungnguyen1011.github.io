public class App {
    public static void main(String[] args) {
        Controller ctrl = new Controller();
        ctrl.getData();

        for (Person person : ctrl.ageFilter()) {
            System.out.println(person);
        }
        ctrl.averageAge();
        ctrl.averageAgeByCountry();

    }
}
