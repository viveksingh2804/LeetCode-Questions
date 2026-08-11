class Solution {
    public int findMin(int[] nums) {
        
        int first=0;
        int last=nums.length-1;
      
        int min=Integer.MAX_VALUE;
        while(first<=last)
        {
            int mid=first+(last-first)/2;
            if(nums[mid]>=nums[first])
            {
               min=Math.min(min,nums[first]);
               first=mid+1;
            }
            else{
                 min=Math.min(min,nums[mid]);
                 last=mid-1;
            }
        }
        return min;
    }
}