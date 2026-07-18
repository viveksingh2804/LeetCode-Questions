class Solution {
    public String restoreString(String s, int[] indices) {
        String b1[]=s.split("");
        char b[]=new char[s.length()];
        String q="";
        // int i=0;
        // int j=0;
        for(int i=0;i<indices.length;i++)
        {
            b[indices[i]]=s.charAt(i);
        }
        return new String(b);
    }
}