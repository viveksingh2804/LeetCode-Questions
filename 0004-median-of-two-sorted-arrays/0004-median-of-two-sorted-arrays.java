import java.util.*;

class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int a = nums1.length;
        int b = nums2.length;
        int nums3 = a + b;
        
        int[] c = new int[nums3];
        System.arraycopy(nums1, 0, c, 0, a);
        System.arraycopy(nums2, 0, c, a, b);
        
        Arrays.sort(c);

        int z = c.length;
        
        if (z % 2 == 0) {
            int mid1 = z / 2;
            int mid2 = mid1 - 1;
            return (c[mid1] + c[mid2]) / 2.0;
        } else {
            int mid = z / 2;
            return c[mid];
        }
    }
}