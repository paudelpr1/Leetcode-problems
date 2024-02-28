class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length == 0){
            return 0;
        }
        Arrays.sort(nums);
        int maxcount = 1; 
        int count = 1;
        int start = nums[0];
        for(int i = 1; i < nums.length; i++){
            if(nums[i] != start && nums[i] == (start+1)){
                count++;
            }
            else if(nums[i] == start){
                continue;
            }
            else{
                maxcount = Math.max(maxcount, count);
                count = 1;
            }
            start = nums[i];
            
        }
        maxcount = Math.max(maxcount, count);
        return maxcount;


        
    }

    // public static void swap(int[] arr, int first, int second)
    // {
    //     int temp = arr[second];
    //     arr[second] = arr[first];
    //     arr[first] = temp;
    // }

    // public static void Sort(int[] arr){
    //     for(int i = 0; i< arr.length - 1; i++){
    //         for(int j = i+1; j > 0; j--){
    //             if(arr[j] < arr[j-1]){
    //                 swap(arr, j, j-1);
    //             }
    //             else{
    //                 break;
    //             }
    //         }
    //     }
    // }
}