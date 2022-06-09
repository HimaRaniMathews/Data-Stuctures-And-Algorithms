public class Amstrong {
    public static void main(String[] args) {
        for(int i=100;i<1000;i++){
            if(Arm(i)){
                System.out.println(i);
            }
        }
    }
    static boolean Arm(int n){
        int a=0;
        int t=n;
        while(n>0){
            int r=n%10;
            n=n/10;
            a+=r*r*r;
        }
        return t == a;
    }
}
