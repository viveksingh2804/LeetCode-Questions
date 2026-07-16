class Solution {
    public int rob(int[] nums) {
        int prev = 0;
        int cur = 0;
        
        for (int n : nums) {
            int temp = cur;
            cur = Math.max(cur, prev + n);
            prev = temp;
        }
        
        return cur;
    }
}