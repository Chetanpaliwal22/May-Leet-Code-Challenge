class Solution {
    public int change(int amount, int[] coins) {
        
        int[][] dp = new int[coins.length+1][amount+1];
          dp[0][0] = 1;
        for(int i=0;i<=coins.length;i++){
            for(int j=0;j<=amount;j++){
                if(j==0){
                        dp[i][j] = 1;
                }
                else if(i>0){
                    if(j-coins[i-1] >=0 && j-coins[i-1] <= amount+1){
                    dp[i][j] = dp[i-1][j] +  dp[i][j-coins[i-1]] ;
                    }else{
                        dp[i][j] = dp[i-1][j];
                    }
                }
            }
        }
        return dp[coins.length][amount];
    }
}
