class Solution {
    public int missingNumber(int[] nums) {

       int n=nums.length;
       int p=n*(n+1)/2;int q=0;
       for(int i=0;i<n;i++)
       {
        q+=nums[i];
       }
       return p-q;
    }
}