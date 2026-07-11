class Solution {
    public int maxWidthRamp(int[] nums) {
    int suffix[] = new int[nums.length];
        int r=0;
        int max = 0;
        for (int i = nums.length - 1; i >= 0; i--) {
            max = Math.max(max, nums[i]);
            suffix[i] = max;
        }
        int n=nums.length;
        
        int i = 0, j = 1;
        int ans = 0;

        while (j < n) {
            if (nums[i] <= suffix[j]) {
                ans = Math.max(ans, j - i);
                j++;
            } else {
                i++;
                 
            }
        }

        return ans;
    }
}