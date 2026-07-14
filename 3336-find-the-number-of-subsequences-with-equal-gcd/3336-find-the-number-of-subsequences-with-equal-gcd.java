class Solution {
    static final int MOD = 1000000007;

    public int subsequencePairCount(int[] nums) {
        int[][] dp = new int[201][201];
        dp[0][0] = 1;

        for (int x : nums) {
            int[][] ndp = new int[201][201];
            for (int g1 = 0; g1 <= 200; g1++) {
                for (int g2 = 0; g2 <= 200; g2++) {
                    int cur = dp[g1][g2];
                    if (cur == 0) continue;

                    ndp[g1][g2] = (ndp[g1][g2] + cur) % MOD;

                    int ng1 = g1 == 0 ? x : gcd(g1, x);
                    ndp[ng1][g2] = (ndp[ng1][g2] + cur) % MOD;

                    int ng2 = g2 == 0 ? x : gcd(g2, x);
                    ndp[g1][ng2] = (ndp[g1][ng2] + cur) % MOD;
                }
            }
            dp = ndp;
        }

        long ans = 0;
        for (int g = 1; g <= 200; g++) {
            ans += dp[g][g];
        }
        return (int) (ans % MOD);
    }

    private int gcd(int a, int b) {
        while (b != 0) {
            int t = a % b;
            a = b;
            b = t;
        }
        return a;
    }
}