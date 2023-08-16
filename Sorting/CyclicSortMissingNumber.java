package Sorting;

/*
 * https://leetcode.com/problems/missing-number/description/
 */

public class CyclicSortMissingNumber {

    public static void main(String[] args) {
        int[] arr = { 0, 1 };
        cyclicSort(arr);
        int x = findNum(arr);
        System.out.println(x);

    }

    static void cyclicSort(int[] arr) {
        int i = 0;
        int N = arr.length;
        while (i < N) {
            int index = arr[i];
            if (arr[i] != N && arr[i] != arr[index]) {
                swap(arr, i, index);
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

    static int findNum(int[] arr) {
        int i = 0;
        while (i < arr.length) {
            if (arr[i] == i) {
                i++;
            } else {
                return i;
            }
        }
        return arr.length;
    }

}
