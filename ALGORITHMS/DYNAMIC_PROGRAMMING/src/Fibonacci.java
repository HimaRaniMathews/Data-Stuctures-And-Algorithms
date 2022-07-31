public class Fibonacci
{
    //Bottom-Up Approach
    /*
    5
    3  2
  2  1
 1   0
    */
    public static void main(String[] args) {
        int n=9;
        int[] f=new int[n+1];
        f[0]=0;
        f[1]=1;
        for(int i=2;i<=n;i++){
            f[i]=f[i-1]+f[i-2];
        }
        System.out.println(f[n]);
    }
}
