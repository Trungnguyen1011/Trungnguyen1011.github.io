public class Math {
    public boolean isOdd(int x) {
      return x % 2 == 0;
    }
  
    public float calculateBMI(float height, float weight) {
      return 0.0f;
    }
  public float BMI (float height, float weight) { return weight/(height*height);}
    public float circle_perimeter(float diameter) {
      return 0.0f;  
    }
    public float chuvi (float diameter) {return diameter * 3.14f;}
  
    public boolean isTriangle(float x, float y, float z) {
      return false;
    }
    public boolean Triangle (float a, float b, float c) 
    {
        return ((a - b < c) && (a + b > c)); 
    }
  public float min2 (float x, float y) { 
      if (x < y)
     { return x ;
    } 
     else { return y ; } 
}
public float min3 (float x, float y, float z) {
    return min2(min2(x,y), z);

}


    public float smallestIn3Numbers(float x, float y, float z) {
      return 0.0f;
    }
    public float sum(int[] numbers) {
      return 0.0f;
    }
  
    public float average(int[] numbers) {
      return 0.0f;
    }
  
    public int[] reverseArray(int[] numbers) {
      return null;
    }
  
  }