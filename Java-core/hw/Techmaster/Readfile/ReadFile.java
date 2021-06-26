import java.io.FileReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

public class ReadFile {
    public List<Person> readData() {
        List<Person> listPersons = new ArrayList<Person>();
        try (FileReader reader = new FileReader("DemoData.json")) {
            listPersons = new Gson().fromJson(reader, new TypeToken<List<Person>>() {
            }.getType());
            reader.close();
        } catch (Exception e) {
            e.getMessage();
        }
        return listPersons;
    }

    public void getPersons(List<Person> personData) {
        for (Person person : personData) {
            System.out.println(person);
        }
    }

    public void getPersonByCountry(List<Person> personData) {
        Map<String, Integer> byCountry = new HashMap<String, Integer>();
        Integer counting;
       
            for (Person person : personData) {

                Integer isExisted = byCountry.get(person.getCountry());
                if (isExisted == null) {
                    byCountry.put(person.getCountry(), 1);
                } else {
                    counting = byCountry.get(person.getCountry());
                    byCountry.put(person.getCountry(), counting + 1);
                }
            }
            for (String country : byCountry.keySet()) {
                System.out.println(country + ": " + byCountry.get(country));
            }
    }
}
