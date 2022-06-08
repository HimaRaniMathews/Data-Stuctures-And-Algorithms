import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=0;
        int b=1;
        int n=sc.nextInt();
        int count=2;
        while(count<=n){
            int t=b;
            b=t+a;
            a=t;
            count++;
//            System.out.println(b);
        }
        System.out.println(b);
    }
}
