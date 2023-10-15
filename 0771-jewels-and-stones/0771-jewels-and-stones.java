class Solution {
    public int numJewelsInStones(String j, String s){
        int count = 0;
        List<Character> arr = new ArrayList<>(); 
        for (int a = 0; a< j.length(); a++){
            arr.add(j.charAt(a));
        }
        
        for(int i = 0; i < s.length(); i++ ){
            if (arr.contains(s.charAt(i))){
                count++; 
            }
        }
        
        return count; 
    }
}