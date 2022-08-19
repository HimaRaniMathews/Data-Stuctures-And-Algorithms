public class Length_Longest_balanced_Parathesis {
    public static void main(String[] args) {
        String str="(())()())";
        int s=0;
        int max=0;
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)=='('){
                s+=1;
            }
            else{
                s-=1;
            }
            if(str.charAt(i)==')'){
                s+=1;
            }
            else{
                s-=1;
            }
        }
    }
}
