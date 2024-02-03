class Solution {
    public boolean isAnagram(String s, String t) {

        if(s.length() != t.length()){
            return false;
        }

        Map<Character, Integer> storemap = new HashMap<>();

        for(int i = 0; i < s.length(); i++){
            storemap.put(s.charAt(i), storemap.getOrDefault(s.charAt(i), 0) + 1);
        }

        for(int i = 0; i < t.length(); i++){
            storemap.put(t.charAt(i), storemap.getOrDefault(t.charAt(i), 0) - 1);
        }

        for(int val: storemap.values()){
            if(val != 0){
                return false;
            }
        }
        return true;
    }
}