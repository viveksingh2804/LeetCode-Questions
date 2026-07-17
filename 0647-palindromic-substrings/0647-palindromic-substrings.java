class Solution {
    public int countSubstrings(String s) {
        int n = s.length();
        int count = 0;

        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {

                int low = i;
                int high = j;

                boolean flag = true;

                while (low < high) {
                    if (s.charAt(low) != s.charAt(high)) {
                        flag = false;
                        break;
                    }
                    low++;
                    high--;
                }

                if (flag)
                    count++;
            }
        }

        return count;
    }
}