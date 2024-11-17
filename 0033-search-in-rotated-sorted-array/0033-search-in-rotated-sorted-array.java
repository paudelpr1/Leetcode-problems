class Solution {
    public int search(int[] nums, int target) {
        int left = 0; 
        int right = nums.length -1; 
        while(left <= right)
        {
            int mid = left + (right -left)/2; 
            if(nums[mid] == target)
            {
                return mid; 
            }

            //is it in right sorted portion
            if(nums[left] <= nums[mid])
            {
                if(target > nums[mid] || target < nums[left])
                {
                    left = mid +1; 
                }
                else{
                    right = mid-1; 
                }
            }

            //is in the left sorted portion
            else{
                if(target < nums[mid] || target > nums[right])
                {
                    right = mid -1;
                }
                else{
                    left = mid +1; 
                }
            }
         }

        return -1;
    }
}