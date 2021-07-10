import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class App {
    public static void main(String[] args) throws Exception {
        ArrayList<Person> list = new ArrayList<>();


        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(4);
        numbers.add(7);
        numbers.add(1);
        numbers.add(3);
        numbers.add(8);
        numbers.add(8);
        numbers.add(2);
        numbers.add(1);
        ArrayList<String> str = new ArrayList<>();
        str.add("Ngoc");
        str.add("Hoang");
        str.add("Tuan");
        str.add("Hoa");
        System.out.println("Danh sách những so chia het cho 2:");
        numbers.stream().filter(number -> number % 2 == 0).limit(2).forEach(number -> System.out.println(number));
        System.out.println("Danh sách những so nhan 10:");
        numbers.stream().map(number -> number* 10).forEach(number -> System.out.println(number));
        System.out.println("Danh sách sau sap xep:");
        str.stream().sorted().forEach(number -> System.out.println(number));

        System.out.println("Danh sách sau sap xep:");
        str.stream().sorted((str1, str2) -> str1.length() - str2.length()).forEach(string -> System.out.println(string));
        // animalList.stream().filter(animal -> animal.getLeg() == 4).forEach(animal -> System.out.println(animal));
        animeList.stream()
        .sorted((ani1, ani2) -> (ani1.getName()).compareTo(ani2.getName()))
        .forEach(animal -> System.out.println(animal));

        // list.add(new Person("Ngoc", 25));
        // list.add(new Person("Hoang", 30));
        // list.add(new Person("Tuan", 27));
        // list.add(new Person("Hoa", 20));
        // Long start, end;
        // show(list);

        // // sử dụng Comparator
        // Collections.sort(list, new Comparator<Person>() {

        //     @Override
        //     public int compare(Person o1, Person o2) {
        //         // TODO Auto-generated method stub
        //         return o1.getName().compareTo(o2.getName());
        //     }

        // });
        // // Sử dụng lambda
        // Collections.sort(list, (o1, o2) -> {
        //     return o1.getName().compareTo(o2.getName());
        // });

        // // Sử dụng lambda sắp xếp theo tên với phương thức compareByName
        // Collections.sort(list, (o1, o2) -> Person.compareByName(o1, o2));
        // System.out.println("Danh sách sắp xếp theo tên: ");
        // show(list);

        // // Sử dụng lambda sắp xếp theo tuổi
        // Collections.sort(list, (o1, o2) -> Person.compareByAge(o1, o2));
        // System.out.println("Danh sách sắp xếp theo tuổi: ");
        // show(list);

        // // Không sử dụng lambda
        // System.out.println("Danh sách những người lớn hơn 25 tuổi là: ");
        // for (Person person2 : list) {
        //     if (person2.getAge() > 25) {
        //         System.out.println(person2);
        //     }
        // }

        // // Lọc những người có tuổi lớn hơn 25 sử dụng lambda
        // System.out.println("Danh sách những người có tuổi lớn hơn 25 là:");
        // list.stream().filter(person -> person.getAge() > 25).forEach(person -> System.out.println(person));
        // start = System.nanoTime();
        // System.out.println("Danh sách những người có tuổi chẵn lambda:");
        // list.stream().filter(person -> person.getAge() % 2 == 0).forEach(person -> System.out.println(person));
        // end = System.nanoTime();
        // System.out.println("Use lambda: " + (end - start));

        
        // start = System.nanoTime();
        // System.out.println("Danh sách những người có tuổi chẵn:");
        // for (Person person2 : list) {
        //     if (person2.getAge() % 2 == 0) {
        //         System.out.println(person2);
        //     }
        // }
        // end = System.nanoTime();
        // System.out.println("Use for: " + (end - start));

    }

    public static void show(ArrayList<Person> list) {
        list.forEach(person -> System.out.println(person));
    }
}
