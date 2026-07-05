class Solution {
    int mod = 1000000007;

    public int[] pathsWithMaxScore(List<String> board) {
        int n = board.size();

        char[][] g = new char[n][];
        for (int i = 0; i < n; i++)
            g[i] = board.get(i).toCharArray();

        int[][] score = new int[n][n];
        int[][] count = new int[n][n];

        for (int i = 0; i < n; i++)
            Arrays.fill(score[i], -1);

        score[n - 1][n - 1] = 0;
        count[n - 1][n - 1] = 1;

        int[][] dir = {{1, 0}, {0, 1}, {1, 1}};

        for (int i = n - 1; i >= 0; i--) {
            for (int j = n - 1; j >= 0; j--) {

                if (g[i][j] == 'X' || (i == n - 1 && j == n - 1))
                    continue;

                int max = -1, ways = 0;

                for (int[] d : dir) {
                    int ni = i + d[0];
                    int nj = j + d[1];

                    if (ni >= n || nj >= n || score[ni][nj] == -1)
                        continue;

                    if (score[ni][nj] > max) {
                        max = score[ni][nj];
                        ways = count[ni][nj];
                    } else if (score[ni][nj] == max) {
                        ways = (ways + count[ni][nj]) % mod;
                    }
                }

                if (max == -1)
                    continue;

                int val = (g[i][j] >= '0' && g[i][j] <= '9') ? g[i][j] - '0' : 0;

                score[i][j] = max + val;
                count[i][j] = ways;
            }
        }

        return score[0][0] == -1
                ? new int[]{0, 0}
                : new int[]{score[0][0], count[0][0]};
    }
}