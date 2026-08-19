class Solution {
    public int shipWithinDays(int[] piles, int h) {
        int st = 1;
        int end = 0;

        for (int i : piles) {
            end += i;
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
        int days = 1;
        int sum = 0;

        for (int i : arr) {
            if (i > mid)
                return false;

            if (sum + i > mid) {
                days++;
                sum = i;
            } else {
                sum += i;
            }
        }

        return days <= h;
    }
}