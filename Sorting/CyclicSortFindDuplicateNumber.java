package Sorting;

import java.util.ArrayList;
import java.util.List;

/*
 * https://leetcode.com/problems/find-all-duplicates-in-an-array/
 */
public class CyclicSortFindDuplicateNumber {
    public static void main(String[] args) {
        int[] arr = { 4, 3, 2, 7, 8, 2, 3, 1 };
        List<Integer> result = new ArrayList<Integer>();
        cyclicSort(arr);
        result = findDuplicateNumbers(arr);
        System.out.println(result.toString());

    }

    static List<Integer> findDuplicateNumbers(int[] nums) {
        List<Integer> result = new ArrayList<Integer>();
        int i = 0;
        while (i < nums.length) {
            if (nums[i] == i + 1) {
                i++;
            } else {
                result.add(nums[i]);
                i++;
            }
        }
        return result;

    }

    static void cyclicSort(int[] nums) {
        int i = 0;
        while (i < nums.length) {
            int index = nums[i] - 1;
            if (nums[i] != nums[index]) {
                swap(nums, i, index);
            } else {
                i++;
            }
        }
    }

    static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
