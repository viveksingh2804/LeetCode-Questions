class Solution {
    public int reverse(int x) {

        if (x < 0) {
            long p = Math.abs((long)x);
            long ans = reverse2(p);

            if (ans > Integer.MAX_VALUE)
                return 0;

            return (int)(-ans);
        } else {
            long ans = reverse2(x);

            if (ans > Integer.MAX_VALUE)
                return 0;

            return (int)ans;
        }
    }

    public long reverse2(long x) {
        long s = 0;

        while (x > 0) {
            long a = x % 10;
            s = s * 10 + a;
            x /= 10;
        }

        return s;
    }
}