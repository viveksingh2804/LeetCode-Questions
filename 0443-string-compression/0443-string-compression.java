class Solution {
    public int compress(char[] chars) {
        int n=chars.length;
        int index=0;
        for(int i=0;i<n;)
        {
            char curr=chars[i];
            int count=0;
            while(i<n&&curr==chars[i])
            {
                count++;
                i++;
            }
            chars[index]=curr;
            index++;
            String s="";
            if(count>1)
            {
                s=s+count;
                for(char ch:s.toCharArray()){
                    chars[index]=ch;
                    index++;
                }
            }
        }
        return index;
    }
}