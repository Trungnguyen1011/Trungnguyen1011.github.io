import java.util.ArrayList;

public class MyHashMap {
    private ArrayList<Data> myBucket[];
    private final int SIZE = 1000;

    public MyHashMap() {
        myBucket = new ArrayList[SIZE];
        for (int i = 0; i < myBucket.length; i++) {
            myBucket[i] = new ArrayList<>();
        }
    }

    private int hashFunction(int key) {
        int hashValue = key % SIZE;
        return hashValue;
    }

    public void put(int key, int value) {
        int hashValueIndex = hashFunction(key);
        var bucket = myBucket[hashValueIndex];
        Data newData = new Data(key, value);
        int keyIndex = bucket.indexOf(newData);

        if (keyIndex >= 0) {
            bucket.get(keyIndex).value = value;
        } else {
            bucket.add(newData);
        }

    }

    public void remove(int key) {
        int hashValueIndex = hashFunction(key);
        var bucket = myBucket[hashValueIndex];
        try {
            int i = 0;
            while(true) {
                if (bucket.get(i).key == key) {
                    bucket.remove(i);
                    break;
                }
                i++;
            }
        } catch (Exception e) {
            System.out.println("Data này không tồn tại để xóa.");
        }

    }

    public Data get(int key) {
        int hashValueIndex = hashFunction(key);
        var bucket = myBucket[hashValueIndex];
      
        try {
            int i = 0;
            while(true) {
                if (bucket.get(i).key == key) {
                    return bucket.get(i);
                }
                i++;
            }
        } catch (Exception e) {
            System.out.println("Data này không tồn tại để lấy.");
        }
  return null;

    }

    
    public static void main(String[] args) {
        MyHashMap myMap = new MyHashMap();
        myMap.put(1, 1);
        myMap.put(2, 2);
        myMap.put(1, 2);
        myMap.put(101, 100);
        myMap.remove(1);
        Data testResult2 = myMap.get(1);
        System.out.println(testResult2);
        Data testResult = myMap.get(101);
        System.out.println(testResult.key + " : " + testResult.value);
        System.out.println("DEBUG!");
    }

}
