import java.util.ArrayList;
import java.util.List;

public class Repository<T extends Book> {
    List<T> list = new ArrayList<T>();

    public List<T> getData() {
        return list;
    }

    public void printData() {
        list.forEach(a -> System.out.println(a));
    }

    public void addData(T t) {
        list.add(t);
    }

    public void removeData(T t) {
        list.remove(list.indexOf(t));
    }

    public void updateData(T t) {
        removeData(t);
        t.input();
        addData(t);
    }

}
