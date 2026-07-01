class Solution {
    public int longestOnes(int[] nums, int k) {
        int ans=0;
        int size=0;
        int si=0;
        int ei=0;
        int count=0;
        while(ei<nums.length)
        {
            if(nums[ei]==0)
            {
                count++;
            }
            while(count>k)
            {
                if(nums[si]==0)
                {count--;}
                si++;
            }
            ans=Math.max(ans,(ei-si+1));
            ei++;
        }
        return ans;
    }
}