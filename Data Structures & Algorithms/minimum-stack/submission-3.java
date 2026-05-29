
class MinStack {
    private Stack<Long> st;
    private Long mini;

    public MinStack() {
        st = new Stack<>();
        mini = Long.MAX_VALUE;
    }
    
    public void push(int val) {
        long longVal = val;
        if (st.isEmpty()) {
            mini = longVal;
            st.push(longVal);
        } else if (longVal < mini) {
            st.push(2 * longVal - mini);
            mini = longVal;
        } else {
            st.push(longVal);
        }
    }
    
    public void pop() {
        if (st.isEmpty()) {
            return;
        }
        long top = st.pop();
        if (top < mini) {
            mini = 2 * mini - top;
        }
    }
    
    public int top() {
        long top = st.peek();
        if (top < mini) {
            return mini.intValue();
        } else {
            return (int) top;
        }
    }
    
    public int getMin() {
        return mini.intValue();
    }
}