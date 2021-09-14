import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

public class ReadFile {
    List<Person> listPersons = new ArrayList<Person>();
    public void readData() {
        
        try (FileReader reader = new FileReader("MOCK_DATA.json")) {
            listPersons = new Gson().fromJson(reader, new TypeToken<List<Person>>() {
            }.getType());
            reader.close();
        } catch (Exception e) {
            e.getMessage();
        }
    
    }
}