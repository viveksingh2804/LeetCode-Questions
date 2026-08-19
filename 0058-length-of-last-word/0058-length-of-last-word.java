class Solution {
    public int lengthOfLastWord(String s) {
        s=" "+s;
        String p[]=s.split(" ");
        int k=p.length;
        int m=p[k-1].length();
        return m;
    }
}