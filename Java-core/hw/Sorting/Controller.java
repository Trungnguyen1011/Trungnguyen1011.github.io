import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Controller<T extends Person> {
   ArrayList<T> collections = new ArrayList<>();
   
   public void sortByName(List<T> t) {
    Collections.sort(t, new Comparator<T>() {

        @Override
        public int compare(T o1, T o2) {
            return o1.getName().compareTo(o2.getName());
        }

    });
 
   
   }

}
