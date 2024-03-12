class Solution {
    public int trap(int[] height) {
        int left = 0;
        int right = height.length -1;
        int MaxLeft = height[left];
        int MaxRight = height[right];
        int storage = 0;
        
        while(left < right){
            int res;
           
            if(MaxLeft <= MaxRight){
                left++;
                res = (Math.min(MaxLeft, MaxRight) - height[left]);
                if(res > 0){
                    storage += res;
                }
                if(height[left] > MaxLeft){
                    MaxLeft = height[left];
                }
            }
            else{
                right--;
                res = (Math.min(MaxLeft, MaxRight) - height[right]);
                if(res > 0){
                    storage += res;
                }
                if(height[right] > MaxRight){
                    MaxRight = height[right];
                }
            }
            
            
        }
        
        return storage;
        
    }
}