class Solution {
    public String addStrings(String a, String b) {
        
        int i=a.length()-1;
        int j=b.length()-1;
        int carry=0;
        StringBuilder s=new StringBuilder();
        while(i>=0||j>=0||carry==1)
        {
            if(i>=0)
                carry+=a.charAt(i--)-'0';
            if(j>=0)
                carry+=b.charAt(j--)-'0';
            int n=carry%10;
            s.append(n);
            carry/=10;
        }

        return (s.reverse().toString());
    }
}
    
    