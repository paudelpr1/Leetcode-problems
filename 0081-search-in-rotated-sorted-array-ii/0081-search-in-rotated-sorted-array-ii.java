public class Solution {
    public boolean search(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (nums[mid] == target) {
                return true;
            }

            // Handle duplicates by skipping them
            while (left < mid && nums[left] == nums[mid]) {
                left++;
            }

            // Determine if the left portion is sorted
            if (nums[left] <= nums[mid]) {
                if (nums[left] <= target && target < nums[mid]) {
                    right = mid - 1; // Target is in the left sorted portion
                } else {
                    left = mid + 1; // Target is not in the left sorted portion
                }
            } else { // Right portion is sorted
                if (nums[mid] < target && target <= nums[right]) {
                    left = mid + 1; // Target is in the right sorted portion
                } else {
                    right = mid - 1; // Target is not in the right sorted portion
                }
            }
        }
        return false;
    }
}
