class Solution {
    public int maximumProduct(int[] nums) {
        Arrays.sort(nums);
        int n=nums.length;
        double p=nums[n-3]*nums[n-2]*nums[n-1];
        double p1 = nums[0]*nums[1]*nums[n-1];
        
        return (int) Math.max(p,p1);
    }
}