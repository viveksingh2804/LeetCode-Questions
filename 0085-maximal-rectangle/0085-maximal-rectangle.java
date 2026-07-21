class Solution {

    public int maximalRectangle(char[][] arr) {

        if (arr == null || arr.length == 0 || arr[0].length == 0)
            return 0;

        int area = 0;

        int rows = arr.length;
        int cols = arr[0].length;

        int m[] = new int[cols];

        // First row
        for (int j = 0; j < cols; j++) {
            m[j] = arr[0][j] - '0';
        }

        area = mah2(m);

        // Remaining rows
        for (int i = 1; i < rows; i++) {

            for (int j = 0; j < cols; j++) {
                if (arr[i][j] == '0')
                    m[j] = 0;
                else
                    m[j]++;
            }

            area = Math.max(area, mah2(m));
        }

        return area;
    }

    public static int mah2(int[] arr) {
        int left[] = MAH.greater(arr);
        int right[] = MAH.smaller(arr);
        return MAH.area(left, right, arr);
    }
    class MAH
    {

    static class Pair {
        int first;
        int second;

        Pair(int first, int second) {
            this.first = first;
            this.second = second;
        }
    }

    public static int[] greater(int[] arr) {
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

    public static int[] smaller(int[] arr) {
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
        int m[] = new int[ans.length];

        for (int i = 0; i < ans.length; i++) {
            m[i] = ans2[i] - ans[i] - 1;
        }

        int max = 0;

        for (int i = 0; i < m.length; i++) {
            m[i] = m[i] * arr[i];
            max = Math.max(max, m[i]);
        }

        return max;
    }
    }

    }
