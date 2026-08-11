class Solution {
    public int mySqrt(int x) {
        int first=0;
        int last=x;
        int ans=0;
        while(first<=last)
        {
            long mid=(first+(last-first)/2);
            if(mid*mid<=x)
            {   
                ans=(int)mid;
                first=(int)mid+1;
                
            }
            else{
                last=(int)mid-1;
            }
        }
        return ans;
    }
}