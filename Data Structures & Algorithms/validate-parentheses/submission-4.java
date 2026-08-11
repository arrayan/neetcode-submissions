public class Solution {
    public boolean isValid(String s) {

        if (s == null || s.length() % 2 != 0) {
            return false;
        }
        Stack<Character> stack = new Stack<>();

        char[] chars = s.toCharArray();
        for (char c : chars) {
            if (c == '(' || c == '[' || c == '{') {
                stack.push(c);
            } 
            else {
                if (stack.isEmpty()) {
                    return false; 
                }
                char top = stack.peek();
                if ((c == ')' && top != '(') ||
                    (c == ']' && top != '[') ||
                    (c == '}' && top != '{')) {
                    return false;
                }
                stack.pop();
            }
        }
        return stack.isEmpty();
    }
}
