class Solution {
    public int diagonalSum(int[][] mat) {
        // if (mat == null || mat.length == 0 || mat[0].length == 0)
        //     return 0;

        int count = 0;
        int n = mat.length;
        int m = mat[0].length;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (i==j||i+j==(m)-1||i+j==n-1)
                    count+=mat[i][j];
            }
        }

        return count;
    }
}