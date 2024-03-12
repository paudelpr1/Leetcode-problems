class Solution {
    public boolean isSubsequence(String s, String t) {
    
        int n = 0; 
        int c = 0;
        while(n < t.length() && c < s.length()){
            if(t.charAt(n) == s.charAt(c)){
                c++;
            }
            n++;
        }

        if(c == (s.length())){
            return true; 
        }
        return false; 

        
    }
}