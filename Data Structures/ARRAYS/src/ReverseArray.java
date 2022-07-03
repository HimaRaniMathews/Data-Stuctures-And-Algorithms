import java.util.Arrays;
import java.util.Scanner;

public class ReverseArray {
    static int MAX=20;
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i <n;i++){
            arr[i]=sc.nextInt();
        }
        int s=0;
        int e=n-1;
        int[] newarr=rev(arr,s,n,e);
        System.out.println(Arrays.toString(newarr));
    }
    public static int[] rev(int arr[],int s,int n,int e){
        int t;
        while(s<e){
            t=arr[s];
            arr[s]=arr[e];
            arr[e]=t;
            s++;
            e--;
        }
        return arr;
    }
}
