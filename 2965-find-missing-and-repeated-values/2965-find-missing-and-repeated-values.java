class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {

        int n = grid.length;
        int m = grid[0].length;
        int max = n * n;

        HashMap<Integer, Integer> map = new HashMap<>();

        int repeated = -1;
        int missing = -1;

       
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {

                int num = grid[i][j];

                map.put(num, map.getOrDefault(num, 0) + 1);

                if (map.get(num) == 2) {
                    repeated = num;
                }
            }
        }

       
        for (int i = 1; i <= max; i++) {
            if (!map.containsKey(i)) {
                missing = i;
                break;
            }
        }

        return new int[]{repeated, missing};
    }
}