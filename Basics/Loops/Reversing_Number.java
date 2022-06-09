public class Reversing_Number {
    public static void main(String[] args) {
        int n=12345;
        int t=n;
        int m=0;
        while(n>0){
            int r=n%10;
            n=n/10;
            m=m*10+r;
         //   System.out.println(m);
        }
        System.out.println("Reverse of "+t+" is "+m);
    }
}

