public class App { 

  public static void main(String[] args) {
        
     
        System.out.println("chao cac ban lop java");
    Math math = new Math();
    System.out.println(math.isOdd(4));
    float height = 174f;
    float weight = 84f;
    System.out.println("Chi so BMI cua toi la  " + math.BMI(height,weight));
 Float diameter = 4f; 
 System.out.println("chu vi cua hinh tron co duong kinh " + diameter + "nay la = " + 
 math.chuvi(diameter));
 
 float x = 3f;
 float y = 4f;
 float z = 2f;
  System.out.println("so nho nhat trong x: " + x
+ ", y: " + y 
+ ", z: " + z 
+ " la " + math.min3(x, y, z));



  }}