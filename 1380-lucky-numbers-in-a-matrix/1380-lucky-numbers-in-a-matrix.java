class Solution {
    public List<Integer> luckyNumbers(int[][] m) {
        ArrayList<Integer> list = new ArrayList<>();

        int row = m.length;
        int col = m[0].length;

        int[] r = new int[row];
        int[] c = new int[col];

        for (int i = 0; i < row; i++) {
            int min = Integer.MAX_VALUE;
            for (int j = 0; j < col; j++) {
                min = Math.min(min, m[i][j]);
            }
            r[i] = min;
        }

        for (int j = 0; j < col; j++) {
            int max = Integer.MIN_VALUE;
            for (int i = 0; i < row; i++) {
                max = Math.max(max, m[i][j]);
            }
            c[j] = max;
        }

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (m[i][j] == r[i] && m[i][j] == c[j]) {
                    list.add(m[i][j]);
                }
            }
        }

        return list;
    }
}