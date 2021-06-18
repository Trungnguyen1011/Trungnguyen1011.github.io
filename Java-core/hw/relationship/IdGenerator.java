import java.util.concurrent.locks.ReentrantLock;
// ReentantLock hàm mới, search gg.

// Class tạo Id
public class IdGenerator {
  private static Long customerId = 0L;
  private static Long orderId = 0L;
  private static Long productId = 0L;
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
  
  public static Long getNewOrderId() {
    Long result;
    lock.lock();
    try {
      result = ++orderId;
    } finally {
      lock.unlock();
    }
    return result;
  }
  
  public static Long getNewProductId() {
    Long result;
    lock.lock();
    try {
      result = ++productId;
    } finally {
      lock.unlock();
    }
    return result;
  }
  private IdGenerator() {
  }
  // một cái method Idgenerator để private không biết để làm gì
}
