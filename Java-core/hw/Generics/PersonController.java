import java.util.ArrayList;

public class PersonController<T extends Person> {
    ArrayList<T> list = new ArrayList<T>();
    public void add (T t){
        list.add(t);
    }
    public void display(){
      list.forEach(t -> System.out.println(t));
    }
}
