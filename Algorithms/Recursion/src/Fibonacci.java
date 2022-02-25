import java.util.Scanner;

public class Fibonacci {
	static int fib(int n) {
		if(n==0)
			return 0;
		if(n==1)
			return 1;
		else
			return fib(n-1)+fib(n-2);
	}
public static void main(String args[]) {
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	for(int i=0;i<n;i++) {
		int res=fib(i);
		System.out.print(res+" ");
	}

}
}
