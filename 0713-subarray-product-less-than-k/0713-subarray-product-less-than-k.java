class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
       int si=0;
       int ci=0;
       int count=0;
       int p=1;
       while(ci<nums.length)
       {
        p=p*nums[ci];
        while(p>=k && si<=ci)
        {
            p=p/nums[si];
            si++;
        }
        count=count+(ci-si+1);
        ci++;
       }
       return count;
    }
}