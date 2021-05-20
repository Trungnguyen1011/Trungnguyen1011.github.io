import car.SmartCar;

public class App {
    public static int add(int a, int b) 
    {return a + b;}
    public static void main(String[] args) {
       int a = 10;
       int b = 15;
       System.out.println(add(a, b));

       SmartHome smartHome = new SmartHome();
       smartHome.say("hom nay troi dep ghe");

       SmartCar smartCar = new SmartCar();
       smartCar.run();
    }
}
    