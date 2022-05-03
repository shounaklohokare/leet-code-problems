class Solution {
    public boolean isValid(String s) {
        
        Map<Character, Character> map = new HashMap<>();
        
        map.put('{', '}');
        map.put('(', ')');
        map.put('[', ']');
        
        Stack<Character> stack = new Stack<>();
        
        for(int i=0; i<s.length(); i++){
            
            char curr = s.charAt(i);
            
            if(map.containsKey(curr)) stack.push(curr);
            
            else if(map.values().contains(curr)){
                if(!stack.empty() && map.get(stack.peek())==curr) stack.pop();
                
                else return false;
            }
        }
        return stack.empty();
        
    }
}
