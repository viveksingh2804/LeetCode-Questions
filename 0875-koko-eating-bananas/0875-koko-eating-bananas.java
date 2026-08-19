class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int st = 1;
        int end = 0;

        for (int i : piles) {
            end = Math.max(end, i);
        }

        while (st <= end) {
            int mid = st + (end - st) / 2;

            if (check(mid, piles, h)) {
                end = mid - 1;
            } else {
                st = mid + 1;
            }
        }

        return st;
    }

    public static boolean check(int mid, int arr[], int h) {
        long total = 0;

        for (int i = 0; i < arr.length; i++) {
            long t = (arr[i] + mid - 1) / mid;
            total += t;
        }

        return total <= h;
    }
}