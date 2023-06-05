public class Array{
    public static void main(String args[]) {
        int[] val = {3,2,4};
        int target = 6;
        int[] answer = twoSum(val, target);
        for (int i = 0; i < answer.length; i++){
            System.out.println(answer[i]);
        }
    }

    public static int[] twoSum(int[] nums, int target) {
        int possibleValue;
        int[] ans = new int[2];
        for(int i = 0; i < nums.length; i++)
        {
            possibleValue = nums[i];
            for(int j = 0 ; j < nums.length; j++)
            {
                if(possibleValue + nums[j] == target && i != j)
                {
                    ans[0] = i;
                    ans[1] = j;
                    break;
                }
                
            }
        
        }
        return ans;
    }
}