class Solution {
    public void nextPermutation(int[] m) {
        int n = m.length;
        int pivot = -1;

        for (int i = n - 2; i >= 0; i--) {
            if (m[i] < m[i + 1]) {
                pivot = i;
                break;
            }
        }

        if (pivot == -1) {
            reverse(0, n - 1, m);
            return;
        }

        for (int i = n - 1; i > pivot; i--) {
            if (m[i] > m[pivot]) {
                swap(i, pivot, m);
                break;
            }
        }

        reverse(pivot + 1, n - 1, m);
    }

    public void swap(int i, int j, int[] m) {
        int temp = m[i];
        m[i] = m[j];
        m[j] = temp;
    }

    public void reverse(int i, int j, int[] m) {
        while (i < j) {
            swap(i, j, m);
            i++;
            j--;
        }
    }
}