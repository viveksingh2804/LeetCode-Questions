class Solution {
    public boolean backspaceCompare(String s, String t) {
        Stack<Character> stack = new Stack<>();

        for(int i = 0; i < s.length(); i++) {
            char b = s.charAt(i);

            if(b != '#')
                stack.push(b);
            else if(!stack.isEmpty())
                stack.pop();
        }

        String q = "";

        while(!stack.isEmpty()) {
            char b = stack.pop();
            q = q + b;
        }

        Stack<Character> stack2 = new Stack<>();

        for(int i = 0; i < t.length(); i++) {
            char b = t.charAt(i);

            if(b != '#')
                stack2.push(b);
            else if(!stack2.isEmpty())
                stack2.pop();
        }

        String q2 = "";

        while(!stack2.isEmpty()) {
            char b = stack2.pop();
            q2 = q2 + b;
        }

        return q.equals(q2);
    }
}