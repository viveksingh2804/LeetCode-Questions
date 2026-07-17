class Solution {
    public int[] gcdValues(int[] nums, long[] queries) {
        int max = 0;
        for (int x : nums) {
            if (x > max) max = x;
        }

        int[] freq = new int[max + 1];
        for (int x : nums) freq[x]++;

        long[] exact = new long[max + 1];

        for (int g = max; g >= 1; g--) {
            long cnt = 0;
            for (int j = g; j <= max; j += g) {
                cnt += freq[j];
            }

            exact[g] = cnt * (cnt - 1) / 2;

            for (int j = g + g; j <= max; j += g) {
                exact[g] -= exact[j];
            }
        }

        for (int i = 1; i <= max; i++) {
            exact[i] += exact[i - 1];
        }

        int[] ans = new int[queries.length];

        for (int i = 0; i < queries.length; i++) {
            long target = queries[i] + 1;

            int l = 1, r = max;
            while (l < r) {
                int mid = (l + r) >>> 1;
                if (exact[mid] >= target)
                    r = mid;
                else
                    l = mid + 1;
            }
            ans[i] = l;
        }

        return ans;
    }
}