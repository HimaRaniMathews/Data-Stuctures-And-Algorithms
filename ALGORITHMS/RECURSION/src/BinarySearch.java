public class BinarySearch
{
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6,7};
        int t=5;
        System.out.println(bs(0,arr.length,arr,t));
    }
    public static int bs(int s,int e,int[] a,int t){
        if(s>e){
            return -1;
        }
        int m=(e+s)/2;
        if(a[m]==t){
            return m;
        }
        if(a[m]>t){
            return bs(s,m-1,a,t);
        }

            return bs(m+1,e,a,t);


    }
}
