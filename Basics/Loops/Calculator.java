import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        char ch=sc.next().trim().charAt(0);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int res=0;
        if(ch== '+'){
           res=a+b;
        }
        else if(ch=='-'){
             res=a-b;
        }
        else if(ch=='*'){
            res=a*b;
        }
        else if(ch=='/'){
            res=a/b;
        }
        else{
            System.out.println("Wrong Operator");
        }
        System.out.println(res);
    }
}
