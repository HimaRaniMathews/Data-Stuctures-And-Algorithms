public class Fibonacci {
    public static void main(String[] args) {
        int n=6;
        int f=fib(n);
        System.out.println(f);
    }
    public static int fib(int n) {
        if (n == 0 || n == 1)
            return n;

        return (fib(n - 1) + fib(n - 2));
    }
}
