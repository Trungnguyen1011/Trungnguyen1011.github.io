import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class App {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<Student>();
        students.add(new Student(10L, "Nguyễn Minh An"));
        students.add(new Student(2L, "Lê Văn Phú"));
        students.add(new Student(8L, "Nguyễn Thành Trung"));
        students.add(new Student(3L, "Dương Băn Thắng"));
        students.add(new Student(11L, "Nguyễn Việt Anh"));
        students.add(new Student(5L, "Nguyễn Quang Tùng"));
        students.add(new Student(6L, "Chử Văn Long"));
        students.add(new Student(7L, "Lê Văn Tốt"));
        students.add(new Student(1L, "Bùi Giáng Sơn"));
        students.add(new Student(9L, "Hoàng Trọng Khoa"));
        students.add(new Student(4L, "Nguyễn Công Khanh"));

        searchByName("Chử Văn Long", students);
        searchById(6L, students);

    }

    public static void searchByName(String name, List<Student> students) {
        Collections.sort(students, (o1, o2) -> o1.getName().compareTo(o2.getName()));
        int iL = 0;
        int iR = students.size() - 1;

        while (true) {
            if (iR < iL) {
                System.out.println("-1");
                break;
            }
            int iMid = (iL + iR) / 2;
            if (students.get(iMid).getName().toLowerCase().equals(name.toLowerCase())) {
                System.out.println(students.get(iMid));
                break;
            } else if (students.get(iMid).getName().toLowerCase().compareTo(name.toLowerCase()) > 0) {
                iR = iMid - 1;
            } else if (students.get(iMid).getName().toLowerCase().compareTo(name.toLowerCase()) < 0) {
                iL = iMid + 1;
            }
        }

    }

    public static void searchById(Long id, List<Student> students) {
        Collections.sort(students, (o1, o2) -> (int) (o1.getId() - o2.getId()));
        int iL = 0;
        int iR = students.size() - 1;

        while (true) {
            if (iR < iL) {
                System.out.println("-1");
                break;
            }
            int iMid = (iL + iR) / 2;
            if (students.get(iMid).getId() == id) {
                System.out.println(students.get(iMid));
                break;
            } else if (students.get(iMid).getId() - id > 0) {
                iR = iMid - 1;
            } else if (students.get(iMid).getId() - id < 0) {
                iL = iMid + 1;
            }
        }

    }
}
