class Solution {
    public String addBinary(String s, String t) {
        StringBuilder res = new StringBuilder(); 
        int carry = 0; 
        int i = s.length() -1;
        int j = t.length() - 1; 
        while(i >= 0 || j >= 0){
            int sum = carry;
            if(i >= 0) sum += s.charAt(i) - '0';
            if(j >= 0) sum += t.charAt(j) - '0';  
            res.append(sum % 2);
            carry = sum / 2; 
            
            i--;
            j--; 
        }

        if(carry != 0) res.append(carry);
        return res.reverse().toString();
    }
}