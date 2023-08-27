package LeetcodeInterviewProblems;

public class JumpII {
    public static void main(String[] args){
        int[] arr = {2,3,1,1,4};
        int ans = jump(arr);
        System.out.println(ans);
    }

    static int jump(int[] nums) {
        int result = 0; 
        int left = 0; 
        int right = 0; 

        while(right < nums.length){
            int farthest = 0; 
            for(int i = left; i <= right ; i++){
                farthest = Math.max(farthest, i + nums[i]);
            }
            left = right + 1;
            right = farthest;
            result++; 
            
        }
        return result; 
    }
}
