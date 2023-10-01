class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        Set<List<Integer>> s = new HashSet<>(); 
        List<List<Integer>> output = new ArrayList<>();

        for(int i = 0; i < nums.length; i++){
            int left = i+1; 
            int right = nums.length - 1; 

            while(left < right){
                int sum = nums[i] + nums[left] + nums[right]; 
                if(sum < 0){
                    left++;
                }
                else if (sum > 0){
                    right--;
                }
                else{
                    s.add(Arrays.asList(nums[i], nums[left], nums[right]));
                    left++; 
                    while(nums[left] == nums[left-1] && left < right)
                    {
                        left++;
                    }
                }
            }
        }
        output.addAll(s);

        return output;
        
    }
}