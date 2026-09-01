class Solution {
    public String removeStars(String s) {
        Stack<Character> stack=new Stack<>();
        for(int i=0;i<s.length();i++)
        {
            char b=s.charAt(i);
            if(b!='*')
            stack.push(b);
            else
            stack.pop();
        }
        String q="";
        while(!stack.isEmpty())
        {
            char b=stack.pop();
            q=b+q;
        }
        return q;
    }
}