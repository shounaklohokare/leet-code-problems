class Solution {
    public boolean isValid(String s) {

        Stack<Character> stack = new Stack<>();

        for (char c : s.toCharArray()) {
            // if current parantheses is an opening parantheses to
            // then push corresponding closing parantheses to the stack
            if (c == '(') {
                stack.push(')');
            } else if (c == '{') {
                stack.push('}');
            } else if (c == '[') {
                stack.push(']');
            }

            else if (stack.isEmpty() || stack.pop() != c) {
                // the stack is empty then return false
                // OR
                // if the character we get after popping the stack
                // is not current character then return false
                return false;
            }

        }

        return stack.isEmpty(); // at the end return true if stack is empty
        // else return false if stack has some element

    }
}