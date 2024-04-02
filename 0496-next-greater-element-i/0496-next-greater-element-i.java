class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int[] res = new int[nums1.length]; 

        Stack<Integer> check = new Stack<>(); 
        Map<Integer, Integer> store = new HashMap<>(); 

        for(int i = 0; i < nums2.length; i++){

            while(!check.isEmpty() && nums2[i] > check.peek()){
                store.put(check.pop(), nums2[i]);
            }
            check.push(nums2[i]);
        }

        for(int j = 0; j< nums1.length; j++){
            res[j] = store.getOrDefault(nums1[j], -1);
        }
        return res;
        
    }
}