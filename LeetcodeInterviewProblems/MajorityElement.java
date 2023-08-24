package LeetcodeInterviewProblems;

/*
 * https://leetcode.com/problems/majority-element/description/?envType=study-plan-v2&envId=top-interview-150
 */

public class MajorityElement {
    public static void main(String[] args){
        int[] arr = {6,6,6,7,7};
        int ans = majorityElement(arr);
        System.out.println(ans);

    }

    static int majorityElement(int[] nums) {
        int count = 0;
        int ans = -1; 
        int temp = count;
        for(int i = 0; i < nums.length; i++)
        {
            for(int j = 0; j < nums.length; j++){
                if(nums[i] == nums[j]){
                    count++;
                }
            }

            
                if(count > (nums.length / 2))
                {
                    temp = count;
                    ans = nums[i];
                    
                }
                
        
            
        }
        return ans;
    }

    static int anotherAppraoch(int[] nums){
    int count = 0;
    int ans = 0; 
    for(int i = 0; i < nums.length; i++)
    {
        if(count == 0){
            ans = nums[i];
        }
        if(nums[i] == ans){
            count++;
        }
        else{
            count--;
        }
    
        
    }
    return ans;
}
}
