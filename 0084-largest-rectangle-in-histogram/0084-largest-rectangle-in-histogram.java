class Solution {
    public int largestRectangleArea(int[]arr) {
         int left[] = greater(arr);
            int right[] = smaller(arr);
            return area(left, right, arr);
            }

         static class Pair {
            int first;
            int second;

            Pair(int first, int second) {
                this.first = first;
                this.second = second;
            }
        }

        public static int[] greater(int arr[]) {
            int n = arr.length;

            int ans[] = new int[n];
            Stack<Pair> stack = new Stack<>();

            for (int i = 0; i < n; i++) {
                if (stack.size() == 0) {
                    ans[i] = -1;
                } else if (stack.peek().first < arr[i]) {
                    ans[i] = stack.peek().second;
                } else {
                    while (stack.size() > 0 && stack.peek().first >= arr[i]) {
                        stack.pop();
                    }

                    if (stack.size() == 0)
                        ans[i] = -1;
                    else
                        ans[i] = stack.peek().second;
                }

                stack.push(new Pair(arr[i], i));
            }

            return ans;
        }

        public static int[] smaller(int arr[]) {
            int n = arr.length;

            int ans2[] = new int[n];
            Stack<Pair> stack = new Stack<>();

            for (int i = n - 1; i >= 0; i--) {
                if (stack.size() == 0) {
                    ans2[i] = n;
                } else if (stack.peek().first < arr[i]) {
                    ans2[i] = stack.peek().second;
                } else {
                    while (stack.size() > 0 && stack.peek().first >= arr[i]) {
                        stack.pop();
                    }

                    if (stack.size() == 0)
                        ans2[i] = n;
                    else
                        ans2[i] = stack.peek().second;
                }

                stack.push(new Pair(arr[i], i));
            }

            return ans2;
        }

        public static int area(int ans[], int ans2[], int arr[]) {
            int max = 0;

            for (int i = 0; i < arr.length; i++) {
                int width = ans2[i] - ans[i] - 1;
                int currArea = width * arr[i];
                max = Math.max(max, currArea);
            }

            return max;
        }

       

    
}