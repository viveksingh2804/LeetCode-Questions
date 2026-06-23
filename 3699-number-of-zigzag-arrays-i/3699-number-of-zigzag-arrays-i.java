class Solution {
    static final int mod = 1000000007;
    public int zigZagArrays(int n, int l, int r) {
        int m = r - l + 1;
        int[] dp = new int[m];
        Arrays.fill(dp, 1);
        for (int i = 2; i <= n; i++) {
            int pre = 0;

            if ((i & 1) == 0) {
                for (int j = 0; j < m; j++) {
                    int cur = dp[j];
                    dp[j] = pre;
                    pre = (pre + cur) % mod;
                }
            } else {
                for (int j = m - 1; j >= 0; j--) {
                    int cur = dp[j];
                    dp[j] = pre;
                    pre = (pre + cur) % mod;
                }
            }
        }
        int ans = 0;
        for (int x : dp) {
            ans = (ans + x) % mod;
        }

        return (ans * 2) % mod;
    }
}