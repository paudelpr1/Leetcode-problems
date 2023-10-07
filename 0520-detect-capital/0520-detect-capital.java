class Solution {
    public boolean detectCapitalUse(String s) {
        if (s.substring(1, s.length()).toLowerCase().equals(s.substring(1, s.length()))){
            return true;
        }
        else if(s.toUpperCase().equals(s)){
            return true;
        }

        return false; 
        
    }
}