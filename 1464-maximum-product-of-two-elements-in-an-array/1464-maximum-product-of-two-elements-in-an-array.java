class Solution {
    public int maxProduct(int[] nums) {
        int i=0;
        int j=nums.length-1;
        int max=0,s=0;
        while(i<j)
        {
            max=(nums[i]-1)*(nums[j]-1);
            if(max>s)
            s=max;
            if (nums[i] < nums[j])
              i += 1;
            else
            j -= 1;
    
       
        }
        return s;
    }
}