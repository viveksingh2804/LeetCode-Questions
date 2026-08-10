class Solution {
    public int searchInsert(int[] arr, int t) {
        int low = 0;
        int high = arr.length - 1;
        
        while (low <= high) {
            int mid = (low + high) / 2;
            if (arr[mid] == t) {
                return mid;
            } else if (arr[mid] < t) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return low; 
    }
}