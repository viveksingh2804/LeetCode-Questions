class Solution {
    public int[][] transpose(int[][] nums) {
        int n=nums.length;
        int m=nums[0].length;
        int matrix[][]=new int[m][n];
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                matrix[j][i]=nums[i][j];
            }
        }
        return matrix;
    }
}