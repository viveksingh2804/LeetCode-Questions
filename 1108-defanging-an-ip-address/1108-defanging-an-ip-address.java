class Solution {
    public String defangIPaddr(String s) {
        String q="";
        for(int i=0;i<s.length();i++)
        {
            char b=s.charAt(i);
            if(b!='.')
            q=q+b;
            else
            {
                q=q+"[.]";
            }
        }
        return q;
    }
}