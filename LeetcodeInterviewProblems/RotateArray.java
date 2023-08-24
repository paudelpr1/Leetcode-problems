package LeetcodeInterviewProblems;

/*
 * https://leetcode.com/problems/rotate-array/?envType=study-plan-v2&envId=top-interview-150
 */

import java.util.Arrays;

public class RotateArray {
    public static void main(String[] args){
        int[] arr = {1,2,3,4,5,6,7};
        rotate(arr, -1);
        System.out.println(Arrays.toString(arr));

    }

    static void rotate(int[] nums, int k) {
        k = k % nums.length;
        int leftPointer = 0; 
        int rightPointer = nums.length - 1;
        swap(nums, leftPointer, rightPointer);
        
        leftPointer = 0; 
        rightPointer = k-1;
        swap(nums, leftPointer, rightPointer);

        leftPointer = k;
        rightPointer = nums.length -1;
        swap(nums, leftPointer, rightPointer);
        

    }

    

    static void swap(int[] arr, int first, int second){
        while(first < second){
            int temp = arr[first];
            arr[first] = arr[second];
            arr[second] = temp;
            first = first + 1;
            second = second - 1; 
        }
        

    }
}
