class Solution {
    public char findTheDifference(String s, String t) {
        int diff = 0; 
        int sum = 0;
         
         for(int i = 0; i < s.length(); i++){
             char c = s.charAt(i);
             diff += (int)c; 
              
         }
         String res = ""; 
         for(int i = 0; i < t.length(); i++){
             char c = t.charAt(i);
             sum += (int)c;
         }
         return (char)(sum - diff); 
         
        
    }
}