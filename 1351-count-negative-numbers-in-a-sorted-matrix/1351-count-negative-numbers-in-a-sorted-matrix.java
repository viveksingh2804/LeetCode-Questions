class Solution {
    public int countNegatives(int[][] mat) {
        if (mat == null || mat.length == 0 || mat[0].length == 0)
            return 0;

        int count = 0;
        int n = mat.length;
        int m = mat[0].length;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (mat[i][j] < 0)
                    count++;
            }
        }

        return count;
    }
}