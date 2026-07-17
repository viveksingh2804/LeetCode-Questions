class Solution {
    public void wiggleSort(int[] nums) {
        Arrays.sort(nums);

        int k = nums.length - 1;
        int m[] = new int[nums.length];
        for (int i = 1; i < m.length; i += 2) {
            m[i] = nums[k];
            k--;
        }
         for (int i = 0; i < m.length; i += 2) {
            m[i] = nums[k];
            k--;
        }

        for (int i = 0; i < nums.length; i++) {
            nums[i] = m[i];
        }
    }
}