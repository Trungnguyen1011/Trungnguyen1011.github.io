public class PrimeUtil {
    public boolean isPrimeA(long number) {
        for (long i = 2; i < number; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

    public boolean isPrimeB(long number) {
        int count = 0;
        for (long i = 1; i <= number; i++) {
            if (number % i == 0) {
                count++;
            }
        }
        return count == 2;
    }

    public boolean isPrimeC(long number) {
        long sqrtOfNumber = (long) Math.sqrt((double) number); // căn bậc 2 của number
        for (int i = 2; i <= sqrtOfNumber; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
    public long[] firstPrime (int N) {
        long[] result = new long[N];
        int count = 0;
        int check = 2;
        while (count < N) {
       /*     if (isPrimeC(check)) {
           result[count] = check;
           count++;
       }
        } */
        boolean isPrime = true;
        for (int i =0; i < count; i++) {
            if (check % result[i] == 0) {
                isPrime = false;
                break;
            }
        }
        if (isPrime) {
        result[count] = check;
        count++;
      }
    check++;

    } return result;
}
}