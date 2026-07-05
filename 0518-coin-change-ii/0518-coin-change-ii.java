class Solution {
    public int change(int amount, int[] coins) {
         int[] dp = new int[amount + 1];
        dp[0] = 1;

        for(int coin:coins)
        {
            for (int j = coin; j <= amount; j++) {
                dp[j] = dp[j] + dp[j - coin];
            }

            //System.out.println("After coin " + coin + " : " + Arrays.toString(dp));
        }

        return dp[amount];
    }
}