class Solution {
    public boolean isValid(String s) {

        Map<Character, Character> mp = new HashMap<>();

        mp.put('(', ')'); // insert opening closing parantheses of each key
        mp.put('[', ']'); // each key value pair in HashMap
        mp.put('{', '}');

        Stack<Character> stck = new Stack<>(); // initalise a stack

        for (int i = 0; i < s.length(); i++) {

            char par = s.charAt(i);

            if (mp.containsKey(par)) {
                // if the current parantheses
                // is an opening parantheses then
                // push it in stack
                stck.push(par);
            }

            else if (mp.values().contains(par)) {
                // else if the current parantheses is a closing parantheses

                if (!stck.isEmpty() && mp.get(stck.peek()) == par) {
                    // then check whether last element of stack's closing parantheses
                    // is equal to current parantheses
                    // if yes then pop that element out of stack
                    stck.pop();
                } else {
                    // else the opening and closing of a parantheses
                    // is not aligned and return false
                    return false;
                }
            }

        }

        return stck.isEmpty(); // then return whether the stack is empty, if it's not empty then
        // it will not be a valid parantheses
        // on the other hand if the stack is empty then it is a valid parantheses

    }
}