import java.util.List;
import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Repository repo = new Repository();
        List<Student> students = repo.getStudentsData();
        space();
        List<Teacher> teachers = repo.getTeachersData();

        while (true) {
            menu();
            int choose = scanner.nextInt();
            scanner.nextLine();
            switch (choose) {
                case 1:

                    break;

                default:
                    break;
            }
        }

    }

    public static void space() {
        System.out.println(
                "\n--------------------------------------------------------------------------------------------------------------------------------------------------------\n");
    }

    public static void menu() {
        System.out.println("Bạn muốn tra cứu thông tin học viên hay giáo viên: ");
        System.out.println("1 : Học viên");
        System.out.println("2 : Giáo viên");

    }

    public static void submenu(String variable) {
        System.out.println("1 : Tìm kiếm phim theo tên");
        System.out.printf("2 : Tìm kiếm phim theo %s", variable);

    }
}