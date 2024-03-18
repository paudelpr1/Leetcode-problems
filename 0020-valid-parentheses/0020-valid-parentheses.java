class Solution {
    public boolean isValid(String s) {
        
        Stack<Character> holder = new Stack<>();
        
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) == '('){
                holder.push(')');
            }
            else if(s.charAt(i) == '{'){
                holder.push('}');
            }
            else if(s.charAt(i) == '['){
                holder.push(']');
            }
            else if(holder.isEmpty() || s.charAt(i) != holder.pop()){
                return false;
            }
        }
        
        if(holder.size() == 0){
            return true;
        }
        
        return false;
        
        
    }
    
    
        
}