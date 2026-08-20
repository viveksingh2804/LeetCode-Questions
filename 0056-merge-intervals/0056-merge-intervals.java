class Solution {
    public int[][] merge(int[][] n) {

        Arrays.sort(n, (a, b) -> a[0] - b[0]);

        List<int[]> list = new ArrayList<>();

        int r = n.length;

        int start = n[0][0];
        int end = n[0][1];

        for (int i = 1; i < r; i++) {

            if (n[i][0] > end) {
                list.add(new int[]{start, end});

                start = n[i][0];
                end = n[i][1];
            }
            else {
                start = Math.min(start, n[i][0]);
                end = Math.max(end, n[i][1]);
            }
        }
        list.add(new int[]{start, end});
        return list.toArray(new int[list.size()][]);
    }
}