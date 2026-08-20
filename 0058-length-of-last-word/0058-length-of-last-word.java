class Solution {
    public int lengthOfLastWord(String s) {
        s=" "+s;
        s=s.trim();
        String p="";
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)!=' ')
            {
                p=p+s.charAt(i);
            }
            else
            p="";
        }
        return p.length();
    }
}