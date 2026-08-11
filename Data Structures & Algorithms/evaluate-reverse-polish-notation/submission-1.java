class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> myStack = new Stack<>();
        for(String s : tokens){
            if (s.equals("+")){
                myStack.push(myStack.pop() + myStack.pop());
            }
            else if (s.equals("-")){
                int a = myStack.pop();
                int b = myStack.pop();
                myStack.push(b-a);
            }
            else if (s.equals("*")){
                myStack.push(myStack.pop() * myStack.pop());
            }
            else if (s.equals("/")){
                int b = myStack.pop();
                int a = myStack.pop();
                myStack.push(a / b);
            }
            else{
                myStack.push(Integer.parseInt(s));
            }
        }
        return myStack.pop();
    }
}
