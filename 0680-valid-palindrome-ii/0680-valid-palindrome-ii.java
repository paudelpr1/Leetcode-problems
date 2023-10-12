class Solution {
    public boolean validPalindrome(String s) {
        int left = 0; 
        int right = s.length() -1; 
        int count = 0;

        while(left < right){
            if(s.charAt(left) != s.charAt(right)){
                return (checkreverseLeft(left, right, s) ||                 (checkreverseRight(left, right, s)));
            }

            left++;
            right--;
        }
        return true; 
        
    }

    public static boolean checkreverseLeft(int left, int right, String s){
        StringBuilder str = new StringBuilder();
        str = str.append(s.substring(left+1, right+1));
        if(str.toString().equals(str.reverse().toString()))
            return true; 
        return false;
    }

    public static boolean checkreverseRight(int left, int right, String s){
        StringBuilder str = new StringBuilder();
        str = str.append(s.substring(left, right));
        if(str.toString().equals(str.reverse().toString()))
            return true; 
        return false;
    }
}