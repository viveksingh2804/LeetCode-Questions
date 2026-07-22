class Solution {
    public int trap(int[] arr) {
        int n = arr.length;
        int s = 0;

        for (int i = 0; i < n; i++) {
            int max1 = maximumleft(i, arr);
            int max2 = maximumright(i, arr);
            int min = Math.min(max1, max2);
            s += (min - arr[i]);
        }

        return s;
    }

    static int maximumleft(int k, int arr[]) {
        int max = 0;
        for (int i = k; i >= 0; i--) {
            max = Math.max(max, arr[i]);
        }
        return max;
    }

    static int maximumright(int k, int arr[]) {
        int max = 0;
        for (int i = k; i < arr.length; i++) {
            max = Math.max(max, arr[i]);
        }
        return max;
    }
}