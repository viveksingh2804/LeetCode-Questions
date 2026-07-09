class Solution {
    public int missingNumber(int[] nums) {
        Arrays.sort(nums);int k=0;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]!=i)
            {
                return i;
            
        }
        else 
        k++;
        }
        // if (k==nums.length-1)
        // return k+1;;

        return k;
    }

}