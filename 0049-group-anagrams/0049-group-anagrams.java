class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> ourmap = new HashMap<>();

        for(String word : strs){
            char[] charArr = word.toCharArray();
            Arrays.sort(charArr);

            String sortedWord = String.valueOf(charArr);

            if(!ourmap.containsKey(sortedWord)){
                ourmap.put(sortedWord, new ArrayList<>());
            }

            ourmap.get(sortedWord).add(word);
            
        }

        return new ArrayList<>(ourmap.values());

        

        
    }
}