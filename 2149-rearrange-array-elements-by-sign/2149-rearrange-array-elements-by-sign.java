class Solution {
    public int[] rearrangeArray(int[] nums) {
        int p = nums.length / 2;

        int[] n = new int[p];
        int[] m = new int[p];

        int a = 0, b = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] < 0) {
                n[a++] = nums[i];
            } else {
                m[b++] = nums[i];
            }
        }
        a=0;b=0;
        for (int i = 0; i < nums.length; i++) {
            if (i % 2 == 0)
                nums[i] = m[b++];
            else
                nums[i] = n[a++];
        }

        return nums;
    }
}