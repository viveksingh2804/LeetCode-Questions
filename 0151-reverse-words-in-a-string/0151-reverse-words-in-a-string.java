class Solution {
    public String reverseWords(String str) {
        String s[] = str.trim().split(" +");
        int n = s.length;
        String ans="";
        for (int i = n - 1; i >= 0; i--) {

            ans=ans+s[i].trim()+" ";
    }
    return ans.trim();
}
}