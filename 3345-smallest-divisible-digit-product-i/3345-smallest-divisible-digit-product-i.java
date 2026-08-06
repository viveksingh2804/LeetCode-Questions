class Solution {
    public int smallestNumber(int n, int t) {
        while(true){
            if(digitprod(n)%t==0)return n;
            n++;
        }
    }
    public static int digitprod(int n){
        int sum=1;
        while(n>0){
            sum*=(n%10);
            n/=10;
        }
        return sum;
    }
}