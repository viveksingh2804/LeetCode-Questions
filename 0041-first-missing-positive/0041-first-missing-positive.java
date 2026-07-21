class Solution {
    public int firstMissingPositive(int[] nums) {
        int j=1;int k1=0;
        Arrays.sort(nums);
        int p=nums.length;
        for(int i=0;i<p;i++)
        {
                if(nums[i]==j)
                j++;
        }
        return j;
    }
}