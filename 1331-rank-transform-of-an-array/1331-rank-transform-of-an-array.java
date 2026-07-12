import java.util.*;

class Solution {
    public int[] arrayRankTransform(int[] arr) {
        int n = arr.length;
        if (n == 0) return arr;

        int[] sa = arr.clone();
        Arrays.sort(sa);

        int[] rank = new int[n];
        rank[0] = 1;

        for (int i = 1; i < n; i++) {
            if (sa[i] == sa[i - 1])
                rank[i] = rank[i - 1];
            else
                rank[i] = rank[i - 1] + 1;
        }

        int[] ans = new int[n];

        for (int i = 0; i < n; i++) {
            int idx = Arrays.binarySearch(sa, arr[i]);

            while (idx > 0 && sa[idx] == sa[idx - 1])
                idx--;

            ans[i] = rank[idx];
        }

        return ans;
    }
}