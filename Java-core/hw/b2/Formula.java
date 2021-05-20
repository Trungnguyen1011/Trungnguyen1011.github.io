import java.util.Arrays;

public class Formula {
    public float average (int[] array) {
        float sum = 0f;
        for (int a = 0; a < array.length; a++) {
            sum += array[a];
        }
        return sum/array.length;
    }

    public int[] reverseArray (int[] array) {
        int s = 0; 
        int e = array.length - 1 ;
        int n;
        while (s < e) {
        n = array[s];
        array[s] = array[e];
        array[e] = n;
        s++; e--;
     }
        return array;
    }

    public static void listed (int[] array) {
        int i;
        for (i = 0 ; i < array.length; i++)
        {
            System.out.print(array[i] + ", ");
        }

    }

    public int countOddNumber (int[] array) {
        int o = 0; int i;
        for (i = 0 ; i < array.length ; i++) 
        {
            if (array[i] % 2 == 1) { o++;}

        }
        return o;
    }


    public static void listedButOddOnly (int[] array) {
        int i;
        for (i = 0 ; i < array.length; i++)
        { 
            if (array[i] % 2 == 1) {
            System.out.print(array[i] + ", "); }
        }
        

    }

    public void bmiRating(float height, float weight) { 
        float bmi = (weight/(height*height));
        if (bmi >= 25.0f) { 
            if (bmi >= 30.0f ) { 
                System.out.println( "Rất nguy hiểm");
            } else { 
                System.out.println( "quá cân");
            }
        }
        else { if (bmi >= 18.5 ) {
            System.out.println( "bình thường");
           } else { 
            System.out.println( "nhẹ cân");
           }
        
        
        }
        
        
        
        }

    }


