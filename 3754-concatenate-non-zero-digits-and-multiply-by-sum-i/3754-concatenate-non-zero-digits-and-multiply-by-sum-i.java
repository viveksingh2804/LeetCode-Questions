class Solution {
    public long sumAndMultiply(int n) {
        int m=0; long p=0; int t=0;long p1=0;
        while(n>0)
        {
            int a=n%10;
            if(a!=0)
            {
                p=a+p*10;
                t=t+a;
            }
            n=n/10;
        }
        while(p>0)
        {
            long a=p%10;
            if(a!=0)
            {
                p1=a+p1*10;

            }
            p=p/10;
        }
        return p1*t;
    }
}