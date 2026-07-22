class Solution {
    public String mergeAlternately(String word1, String word2) {
        int q=word1.length();
        int w=word2.length();
        int m=0;
        int n=1;
        int d=q+w;
        String a="";
        for(int i=0;i<d-1;i++)
        {
            if(m<q||n<=w){
                if(m<q){
            char b=word1.charAt(m);
            a=a+b;
            m++;}
            if(n<=w){
            char c=word2.charAt(n-1);
            a=a+c;
            n++;
            }}
        }
        return a;
    }
}