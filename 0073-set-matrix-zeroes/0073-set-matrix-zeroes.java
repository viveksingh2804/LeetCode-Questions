class Solution {
    public void setZeroes(int[][] mat) {
        int n = mat[0].length;
        int m = mat.length;

        int[] n1 = new int[m];
        int[] m1 = new int[n];

        Arrays.fill(n1, 1);
        Arrays.fill(m1, 1);

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (mat[i][j] == 0) {
                    n1[i] = 0;
                    m1[j] = 0;
                }
            }
        }

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (n1[i] == 0 || m1[j] == 0) {
                    mat[i][j] = 0;
                }
            }
        }
    }
}