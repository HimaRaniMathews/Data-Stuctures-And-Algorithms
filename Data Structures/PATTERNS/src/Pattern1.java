import java.util.Scanner;

public class Pattern1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=1;i<=n;i++){
            int ns=n-i;
            for(int j=1;j<=ns;j++)
            System.out.print("  ");
            for(int k=i;k>=1;k--)
            System.out.print(k+ " ");
            for(int m=2;m<=i;m++)
                System.out.print(m+ " ");
            System.out.println();
        }
    }
}
//            1
//        2   1   2
//    3   2   1   2   3
//4   3   2   1   2   3   4
