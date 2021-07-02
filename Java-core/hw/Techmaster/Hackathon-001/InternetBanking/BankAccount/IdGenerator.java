import java.util.concurrent.locks.ReentrantLock;

public class IdGenerator {
    private static Long customerId = 0L;
    private static Long accountId = 0L;
    private static Long bookId = 0L;
    private static Long authorId = 0L;
    private static ReentrantLock lock = new ReentrantLock();

    public static Long getNewCustomerId() {
        Long result;
        lock.lock();
        try {
            result = ++customerId;
        } finally {
            lock.unlock();
        }
        return result;
    }

    public static Long getNewAccountId() {
        Long result;
        lock.lock();
        try {
            result = ++accountId;
        } finally {
            lock.unlock();
        }
        return result;
    }

    public static Long getNewbookId() {
        Long result;
        lock.lock();
        try {
            result = ++bookId;
        } finally {
            lock.unlock();
        }
        return result;
    }

    public static Long getNewAuthorId() {
        Long result;
        lock.lock();
        try {
            result = ++authorId;
        } finally {
            lock.unlock();
        }
        return result;
    }

    private IdGenerator() {
    }
   
}
