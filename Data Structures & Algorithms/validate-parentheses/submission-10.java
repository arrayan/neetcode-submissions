//import java.util.Stack;

class Solution {
    public boolean isValid(String s) {
        //Openers = ['(','{','['];
        //Closers = [')','}',']'];
        Stack<Character>  myStack = new Stack<>();

        char[] myCharArr = s.toCharArray();
        //Now we have a charArray
        for(char char_:myCharArr){
            if ((char_ == '(') || (char_ == '[') || (char_ == '{')){
                myStack.push(char_);
            }
            if ((char_ == ')') || (char_ == ']') || (char_ == '}')){
                if (myStack.isEmpty()){
                    return false;
                }
                if (char_ == ')'){
                    if (myStack.peek().equals('(')){
                        myStack.pop();
                    }
                    else{
                        return false;
                    }
                }
                if (char_ == ']'){
                    if (myStack.peek().equals('[')){
                        myStack.pop();
                    }else{
                        return false;
                    }
                }
                if (char_ == '}'){
                    if (myStack.peek().equals('{')){
                        myStack.pop();
                    }else{
                        return false;
                    }
                }
            }
        }
        return myStack.empty();
    }   
}

