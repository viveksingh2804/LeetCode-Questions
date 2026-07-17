class Solution {
    public String reverseWords(String s) {
        String p="";
        String w[]=s.split(" ",0);
        for(int i=w.length-1;i>=0;i--)
        if(w[i]!=""){
        if(i>0)
        {
            p=p+w[i].trim()+" ";
        }
        else
        p=p+w[i].trim();
        }
    return p.trim();
    }
}