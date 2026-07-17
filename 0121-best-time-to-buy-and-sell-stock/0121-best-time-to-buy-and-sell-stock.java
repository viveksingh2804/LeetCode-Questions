class Solution {
    public int maxProfit(int[] m) {
        int i = 0;
        int j = 1;
        int max = 0;

        while (j < m.length) {
            if (m[j] > m[i]) {
                max = Math.max(max, m[j] - m[i]);
            } else {
                i = j;
            }
            j++;
        }

        return max;
    }
}