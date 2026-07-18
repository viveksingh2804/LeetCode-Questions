class Solution {
    public int findGCD(int[] nums) {
     int max=nums[0];
     int min=nums[0];
     for(int i=0;i<nums.length;i++)
     {
        if(max>nums[i])
        max=nums[i];
        else if(min < nums[i])
        min=nums[i];
     }
     return gcd(max,min);
    }
    public static int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}