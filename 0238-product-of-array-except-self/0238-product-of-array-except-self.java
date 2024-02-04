class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] result = new int[nums.length];
        int Prefix = 1; 
        int Postfix = 1; 
        result[0] = Prefix;

        for(int i = 1; i < nums.length; i++){
            result[i] = result[i-1] * nums[i-1];

            
        }

        for(int i = nums.length - 1; i >=0; i--){
            result[i] = Postfix * result[i];
            Postfix = Postfix * nums[i];
        }

        return result;
        
    }
}