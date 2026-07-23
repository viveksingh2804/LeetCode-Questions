import java.util.Stack;

class MinStack {

    Stack<Long> s;
    long minele;

    public MinStack() {
        s = new Stack<>();
    }

    public void push(int x) {

        if (s.isEmpty()) {
            s.push((long) x);
            minele = x;
        } 
        else if (x < minele) {
            s.push(2L * x - minele);
            minele = x;
        } 
        else {
            s.push((long) x);
        }
    }

    public void pop() {

        if (s.isEmpty())
            return;

        if (s.peek() < minele) {
            minele = 2 * minele - s.peek();
        }

        s.pop();
    }

    public int top() {

        if (s.isEmpty())
            return -1;

        if (s.peek() < minele)
            return (int) minele;

        return s.peek().intValue();
    }

    public int getMin() {

        if (s.isEmpty())
            return -1;

        return (int) minele;
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */