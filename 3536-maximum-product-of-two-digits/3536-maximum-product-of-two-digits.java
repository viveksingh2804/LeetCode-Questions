class Solution {

    public int maxProduct(int n) {
       int m=n;
        int s=0;
        ArrayList<Integer> list =new ArrayList<>();
       while(n>0)
       {
           int a=n%10;
           list.add(a);
           n=n/10;
       }
       Collections.sort(list);
       int m1=list.size();
       return (list.get(m1-1)*list.get(m1-2));
    }
}