class Solution {
    public static int lengthOfLongestSubstring(String s) {
         Set charSet = new HashSet<>();
        int left = 0; 
        int output = 0;
        
        for (int right = 0; right < s.length(); right++) {
            while (charSet.contains(s.charAt(right))){
                charSet.remove(s.charAt(left));
                left++;
            }
            charSet.add(s.charAt(right));
            output = Math.max(right -left + 1, output); 

        }
        return output;

    }
}