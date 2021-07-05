import java.io.FileNotFoundException;
import java.io.FileReader;
import java.lang.reflect.Type;
import java.util.List;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

public class Repository {
    public List<Student> studentsList;
    public List<Teacher> teachersList;
    public void getStudentsData() {
        

        try {
            FileReader reader = new FileReader("Student.json");
            Type objectType = new TypeToken<List<Student>>() {
            }.getType();
            studentsList = new Gson().fromJson(reader, objectType);
            
            for (Student student : studentsList) {
                System.out.println(student);
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } 
        
    }

    public void getTeachersData() {
        try {
            FileReader reader = new FileReader("Teacher.json");
            Type objectType = new TypeToken<List<Teacher>>() {
            }.getType();
            teachersList = new Gson().fromJson(reader, objectType);
            
            for (Teacher teacher : teachersList) {
                System.out.println(teacher);
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } 
    }
}
