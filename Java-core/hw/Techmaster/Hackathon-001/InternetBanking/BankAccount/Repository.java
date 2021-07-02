import java.util.List;
import java.util.ArrayList;

public class Repository<T extends Entity> {
    protected ArrayList<T> collections = new ArrayList<>();
    Login login = new Login();
    public List<T> getAll() {
       if  (login.isLoginAuthorities()) {
        return collections; } else { throw new RuntimeException("Ban khong co quyen truy cap.");}
    }
    public void add(T t) {
        collections.add(t);
    }

    
}