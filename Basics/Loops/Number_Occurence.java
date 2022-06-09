public class Number_Occurence {
    public static void main(String[] args) {
        int n=4533732;
        int t=n;
        int c=0;
        int m=3;
        while(n!=0){
            int r=n%10;
            if(r==m){
                c++;
            }
            n=n/10;
        }
        System.out.println("Occurence of Number "+m+" " +
                "in " +t+" is "+c);
    }
}
