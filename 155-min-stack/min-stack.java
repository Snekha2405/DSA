 import java.util.Stack;

class MinStack {

    Stack<Long> stack;
    long min;

    public MinStack() {
        stack = new Stack<>();
        min = Integer.MAX_VALUE;
    }
    
    public void push(int val) {
        if (stack.isEmpty()) {
            stack.push(0L); // Push difference (val - min)
            min = val;      // Set min to val
        } else {
            stack.push((long)val - min); // Store the difference
            if (val < min) {
                min = val;         // Update min if the new value is smaller
            }
        }
    }
    
    public void pop() {
        if (stack.isEmpty()) return;
        
        long pop = stack.pop();
        if (pop < 0) { // If the popped value is negative, it means the minimum value was updated
            min = min - pop; // Restore the previous minimum
        }
    }
    
    public int top() {
        long top = stack.peek();
        if (top > 0) {
            return (int)(top + min); // If positive, return the current value
        } else {
            return (int)min; // If zero or negative, return the minimum
        }
    }
    
    public int getMin() {
        return (int)min;
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