class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int left = 0; 
        int total = 0;
        int result = Integer.MAX_VALUE;

        for(int right = 0; right < nums.length; right++){
            total += nums[right];
            while(total >= target){
                result = Math.min(right-left+1 , result);
                total -= nums[left];
                left ++;
            }
        }

        if(result == Integer.MAX_VALUE){
            return 0;
        }
        else{
            return result;
        }
    }
}