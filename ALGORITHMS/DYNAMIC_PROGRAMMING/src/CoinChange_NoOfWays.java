public class CoinChange_NoOfWays {
    public static void main(String[] args) {
        int[] coins={1,2};
        int val=5;
        int ans=maxNoOfWays(coins,val);
        System.out.println(ans);
    }
    public static int maxNoOfWays(int[] coins,int v){
        if(v==0)
            return 1;
        if(coins.length==0)
            return 0;
        int[][] dp=new int[coins.length][v+1];

        for(int i=0;i<coins.length;i++)
            dp[i][0]=1;

        /*Initialising the first row
        - if(value <coins[0])
                then we are putting it as 0
        -if (val==coins[0])
                then putting value of dp[0][0]=dp[i-coins[0][0]= 1 always
        -if(repeat this values from 0-coins[0] i.e if val=3
        then
                1,0,0,1 repeat.....
                            0,0,1
                     hence only positions where
                                    index is divisible by coins[0] is 1
                            else
                                0
         */
        for(int i=1;i<=v;i++){
          dp[0][i]=(i<coins[0])? 0:dp[0][i-coins[0]];
         //   System.out.print (dp[0][i]+" ");
        }

    for (int i = 1; i < coins.length; i++) {
        for (int j = 1; j <= v; j++) {
            if(coins[i]>j){
                dp[i][j]=dp[i-1][j];
            }
            else{
                dp[i][j]=dp[i-1][j]+dp[i][j-coins[i]];
            }


        }

    }
        for (int i = 0; i < coins.length; i++) {
            for (int j = 0; j <= v; j++) {
                System.out.print (dp[i][j]+" ");

            }
            System.out.println();
        }
        return (dp[coins.length-1][v]);
    }
}
