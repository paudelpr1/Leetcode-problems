class Solution {
    public boolean judgeCircle(String s) {
        int L = 0;
        int R = 0; 
        int U = 0; 
        int D = 0; 

        for(int i = 0; i < s.length(); i ++){
            if(s.charAt(i) == 'L'){
                L++;
            }
            else if (s.charAt(i) == 'R'){
                R++;
            }
            else if (s.charAt(i) == 'U'){
                U++;
            }
            else {
                D++;
            }
        }

        if(L == R && U == D){
            return true;
        }
        return false;
    
    }
}