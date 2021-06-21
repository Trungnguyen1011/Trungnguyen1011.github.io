import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Optional;

public class Repository<T extends Entity> {
  protected ArrayList<T> collections = new ArrayList<>();

  public List<T> getAll() {
    return collections;
  }

  public Optional<T> findById(Long id) {
    return collections.stream().filter(p -> p.getId().equals(id)).findFirst();
  }

  public void add(T t) {
    collections.add(t);
  }

  public void update(T t, Long id) {
    for (int i = 0; i < collections.size(); i++) {
      if (collections.get(i).getId().equals(id)) {
        collections.remove(collections.indexOf(t));
        collections.set(i, t);
        t.setId(id);
        break;
      }
    }
  }

  public void deleteProductByID(Long id) {
    Iterator<T> itr = collections.iterator();
    while (itr.hasNext()) {
      T item = itr.next();
      if (item.getId().equals(id)) {
        itr.remove();
      }
    }
  }

}