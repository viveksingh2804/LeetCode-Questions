class Solution {
    public boolean searchMatrix(int[][] mat, int target) {
        int top=0;
        int bottom=mat.length-1;
        while(top<=bottom)
        {
            int low=0;
            int high=mat[0].length-1;
            while(low<=high)
            {
                int mid=(low+high)/2;
                if(mat[top][mid]==target)
                {
                    return true;
                }
                else if(mat[top][mid]<target)
                {
                    low=mid+1;
                }
                else {
                high=mid-1;}
            }
            top++;
        }
        return false;
    }
}