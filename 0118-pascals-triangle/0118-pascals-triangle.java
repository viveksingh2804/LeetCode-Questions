class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> ob=new ArrayList<>();
        for(int i=1;i<=numRows;i++)
        {
            List<Integer> n=new ArrayList<>();
            n.add(1);
            int t=1;
            for(int j=1;j<i;j++)
            {
                t=t*(i-j);
                t/=j;
                n.add(t);
            }
            ob.add(n);
        }
        return ob;
    }
}