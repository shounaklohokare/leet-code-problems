class Solution {
    public String interpret(String command) {
        
        StringBuilder sblder = new StringBuilder(command.length());
        
        for(int i=0; i<command.length(); i++){
            
            if(command.charAt(i) == 'G') sblder.append("G");
            
            if(command.charAt(i) == '('){
                
                if(command.charAt(i+1) == ')'){
                    sblder.append("o");
                    i++;
                }
                
                else{
                    sblder.append("al");
                    i+=3;
                }
            }
            
        }
        
        return sblder.toString();
        
    }
}