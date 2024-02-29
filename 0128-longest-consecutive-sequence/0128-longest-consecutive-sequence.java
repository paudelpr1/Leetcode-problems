class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length == 0) return 0; 

        Set<Integer> store = new HashSet();
        for(int x: nums){
            store.add(x);
        }
        int maxCount = 0; 

        for(int i = 0; i < nums.length; i++){
            int num = nums[i];
            int count = 0;
            if(!store.contains(num-1)){
                while(store.contains(num + count)){
                    count++; 
                }
            }

            maxCount = Math.max(maxCount, count);

        }
        return maxCount;
    }
        
}