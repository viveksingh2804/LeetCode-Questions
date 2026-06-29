class Solution {
    public int subarraysDivByK(int[] nums, int k) {
        Map<Integer, Integer> count = new HashMap<>();
        count.put(0, 1);
        int prefix = 0;
        int ans = 0;

        for (int x : nums) {
            prefix += x;
            int rem = prefix % k;
            if (rem < 0) {
                rem += k;
            }

            if (count.containsKey(rem)) {
                ans += count.get(rem);
                count.put(rem, count.get(rem) + 1);
            } else {
                count.put(rem, 1);
            }
        }

        return ans;
    }
}