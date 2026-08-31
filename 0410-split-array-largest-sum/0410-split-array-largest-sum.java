class Solution {
    public int splitArray(int[] arr, int k) {
        int n=arr.length;
        if(k>n)
        return -1;
        // find search space
        long low=Arrays.stream(arr).max().getAsInt();
        int high=Arrays.stream(arr).sum();
        long ans=0;
        while(low<=high)
        {
            long mid=low+(high-low)/2;
            if(IsitPossible(arr,k,mid))// mid represents a student can read maximum number of pages allocate to any student
            {
                ans=mid;
                high=(int)mid-1;
            }
            else
            low=(int)mid+1;
            
        }
        return (int)ans;
    }
    public boolean IsitPossible(int arr[],int k, long mid)
    {   long students=1;
        long ans=0;
        for(int i=0;i<arr.length;i++)
        {
            if((ans+arr[i])<=mid)
            ans+=arr[i];
            else
            {students++;
            ans=arr[i];}
            if((int)students>k)
            return false;
        }
        return true;
    }
}