public class App {
    public static void main(String[] args) {
        PersonController<Student> students = new PersonController<Student>();
        PersonController<Teacher> teachers = new PersonController<Teacher>();

        students.add(new Student(1L, "Quang Nguyen", 24));
        students.add(new Student(2L, "Tuan Nguyen", 21));
        teachers.add(new Teacher(3L, "Lan Truong", "9000000"));
        teachers.add(new Teacher(4L, "Ngoc Nam", "16000000"));

        students.display();
        teachers.display();

    }
}