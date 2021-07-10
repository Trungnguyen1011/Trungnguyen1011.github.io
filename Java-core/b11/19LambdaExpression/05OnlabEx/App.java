import java.time.LocalDate;

import java.util.HashMap;
import java.util.Map;

public class App {
 public static void main (String[] args) {
     Map<LocalDate, Integer> random = new HashMap<>();
    int numberOfDays = 9;
    

    for (int i = 0; i < numberOfDays; i++) {
        if (i == 0) {
        random.put(LocalDate.now(),getRandomNumber());}
        else { random.put(LocalDate.now().plusDays(i),getRandomNumber());}
    }
    random.forEach((key, value) -> System.out.println("Day " + key + ": " + value));
 }
 public static int getRandomNumber() {
    int randomNum = (int)(Math.random() * 100);
    return randomNum;
 }
}