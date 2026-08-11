class MinStack {
    private Stack<Integer> minStack;
    public MinStack() {
        minStack = new Stack<>(); 
    }
    
    public void push(int val) {
        minStack.push(val);
    }
    
    public void pop() {
        minStack.pop();
    }
    
    public int top() {
        return minStack.peek();
    }
    
    public int getMin() {
        if (minStack.isEmpty()) throw new EmptyStackException();
        //Idk
        //Make a new temp stack and start dumping elemets of it on to the stack, and do comparisons
        //We can onyl do  push, peek and pop
        Stack<Integer> tempStack = new Stack<>();
        int MinVal = minStack.peek();

        while(!minStack.isEmpty()){
            int current = minStack.peek();
            MinVal = Math.min(MinVal, current);
            tempStack.push(minStack.pop());
        }
        //return MinVal;
        while(!tempStack.isEmpty()){
            minStack.push(tempStack.pop());
        }
        return MinVal;

    }
}
