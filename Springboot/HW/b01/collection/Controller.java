import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Controller extends ReadFile {
    public void getData() {
        super.readData();
    }

    public List<Person> ageFilter() {

        return super.listPersons.stream().filter(person -> person.getAge() >= 20 && person.getAge() <= 30)
                .collect(Collectors.toList());
    }

    public void averageAge() {

        System.out.println("Tuổi trung bình của file này là: "
                + super.listPersons.stream().mapToDouble(person -> person.getAge()).average().getAsDouble());
    }

    public void averageAgeByCountry() {

        System.out.println(super.listPersons.stream()
                .collect(Collectors.groupingBy(Person::getNationality, Collectors.averagingDouble(Person::getAge))));
    }
}