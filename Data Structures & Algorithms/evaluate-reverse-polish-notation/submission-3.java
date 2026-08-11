class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> mainStack = new Stack<>();
        for(String c : tokens){
            if(c.equals("+")){
                mainStack.push(mainStack.pop() + mainStack.pop());
            }
            else if (c.equals("*")){
                mainStack.push(mainStack.pop() * mainStack.pop());
            }
            else if(c.equals("/")){
                int a = mainStack.pop();
                int b = mainStack.pop();
                mainStack.push(b/a);
            }
            else if(c.equals("-")){
                int a = mainStack.pop();
                int b = mainStack.pop();
                mainStack.push(b-a);
            }
            else{
                mainStack.push(Integer.parseInt(c));
            }
        }
        return mainStack.pop();
    }
}
