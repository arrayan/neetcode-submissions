class MinStack {
    //Idea is to create two stacks and keep one stack always updated with the minimum value.
    Stack<Integer> mainStack;
    Stack<Integer> minStack;
    
    public MinStack() {
        mainStack = new Stack<>();
        minStack = new Stack<>();           
    }
    
    public void push(int val) {
        mainStack.push(val);
        if(minStack.isEmpty() || minStack.peek() >= val ) minStack.push(val);
    }
    
    public void pop() {
        if (mainStack.isEmpty()) return ;
        int top = mainStack.pop();
        if (top == minStack.peek()){
            minStack.pop();
        }
    }
    
    public int top() {
        return mainStack.peek();
    }
    
    public int getMin() {
        return minStack.peek();
    }
}
