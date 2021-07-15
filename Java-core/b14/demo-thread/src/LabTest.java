import java.util.Random;

public class LabTest extends Thread {
    public void run() {
        Random random = new Random();
        int i = 0;
        int count = 0;
        while (i < 100) {
            int randomNumber = random.nextInt(110);
            try {
                Thread.sleep(2000); 
            } catch (InterruptedException e) {
                System.out.println(e);
            }
            System.out.println(randomNumber);
            i = randomNumber;
            count++;
        }
        System.out.println("Số lượng đã in: " + count);
     
           
       
    }

}
