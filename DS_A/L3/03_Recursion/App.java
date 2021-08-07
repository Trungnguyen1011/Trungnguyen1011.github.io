public class App {
    public static void main(String[] args) {
        filbonacci(1);
    }
    public static int filbonacci(int n) {
        if (n>100) {
            return 666;
        }
        System.out.println(n);
        return filbonacci(n+n);
    }

    public static int soMU(int a, int n) {
        if (n==1) {
            return 1;
        }
        Math.pow(a, n);
        return a;
    }
}
