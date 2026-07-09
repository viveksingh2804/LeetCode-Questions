class Solution {
    public int findMaxConsecutiveOnes(int[] m) {
        int max=0;int q=0;
        for(int i=0;i<m.length;i++)
        {
            if(m[i]==1)
            {
                max++;
            }
            else
            {
                
                max=0;
            }
            q=Math.max(max,q);
        }
        return q;
    }
}