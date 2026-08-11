class MinStack {
    //Initialise Two Stacks instead of One.
    private Stack<Integer> mainStack;
    private Stack<Integer> minStack;
    public MinStack() {
        mainStack = new Stack<>();
        minStack = new Stack<>();
    }
    
    public void push(int val) {
        //Idea is to keep pushing small values on to the min stack
        mainStack.push(val);
        if(minStack.isEmpty() || val <= minStack.peek())
            minStack.push(val);
    }
    
    public void pop() {
        //mainStack.
        if(mainStack.isEmpty()) return ;
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
