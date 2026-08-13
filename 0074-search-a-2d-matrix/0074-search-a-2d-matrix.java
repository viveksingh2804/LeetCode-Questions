class Solution {
    public boolean searchMatrix(int[][] m, int target) {
    int l=m.length;
    int n=m[0].length;
    int low=0;
    int high=(n*l)-1;
    while(low<=high)
    {
        int mid=low+(high-low)/2;
        int r=mid/n;
        int c=mid%n;
        if(m[r][c]==target)
        return true;
        else if (m[r][c]<target)
        low=mid+1;
        else
        high=mid-1;
    }
    return false;
    }
}