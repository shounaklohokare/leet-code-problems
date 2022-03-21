class Solution {
    public String interpret(String command) {
        
        StringBuilder sblder = new StringBuilder();
        
        if(command.charAt(0) == 'G') sblder.append("G");
        
        for(int i=1; i<command.length(); i++){
            
            if(command.charAt(i) == 'G'){ 
                sblder.append("G");
            }
            else if(command.charAt(i-1) == '(' && command.charAt(i) == ')'){                                                                  sblder.append("o");
            }                                                          
            
            else if(command.charAt(i-1)=='(' && command.charAt(i) == 'a'){
                sblder.append("al");
            } 
        }
               
        return String.valueOf(sblder);
        
    }
}
