import java.util.ArrayList;
import java.util.List;

public class Repository <T extends Employee> {
    List<T> employees = new ArrayList<T>();

    public void getAll() {
       employees.forEach(employee -> {
           try {
               Thread.sleep(2000);
           } catch (Exception e) {
               //TODO: handle exception
           }
           System.out.println(employee);
        
        });
    }

    public void add(T t) {
        employees.add(t);
    }
}
