import java.util.Arrays;

class Solution {
    public int kthSmallest(int[][] mat, int k) {
        int n = mat.length;
        int[] m = new int[n * n];
        
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                int index = i * n + j; 
                m[index] = mat[i][j];
            }
        }
        
        Arrays.sort(m);
        
        return m[k - 1]; 
    }
}