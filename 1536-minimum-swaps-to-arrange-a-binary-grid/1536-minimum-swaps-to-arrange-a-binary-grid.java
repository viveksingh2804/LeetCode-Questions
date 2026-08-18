class Solution {
    public int minSwaps(int[][] grid) {
        int n = grid.length;
        int pz[] = new int[n];
        int ans = 0;

        for (int i = 0; i < n; i++) {
            int c = 0;

            for (int j = n - 1; j >= 0; j--) {
                if (grid[i][j] == 0)
                    c++;
                else
                    break;
            }

            pz[i] = c;
        }

        for (int i = 0; i < n; i++) {
            int need = n - i - 1;
            int j = i;

            while (j < n && pz[j] < need)
                j++;

            if (j == n)
                return -1;

            while (j > i) {
                int temp = pz[j];
                pz[j] = pz[j - 1];
                pz[j - 1] = temp;

                ans++;
                j--;
            }
        }

        return ans;
    }
}