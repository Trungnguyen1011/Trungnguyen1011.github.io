
import java.util.concurrent.locks.ReentrantLock;

public class IdGenerator extends Repository {
 
    private static Long Id = 50L;
    private static ReentrantLock lock = new ReentrantLock();

    public static Long getNewId() {
        Long result;
        lock.lock();
        try {
            result = ++Id;
        } finally {
            lock.unlock();
        }
        return result;
    }

    
    public IdGenerator() {
    }
   
}