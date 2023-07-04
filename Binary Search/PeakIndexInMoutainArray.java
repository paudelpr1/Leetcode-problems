/* 
 * Leetcode 162 https://leetcode.com/problems/find-peak-element/description/
 * 
 * Leetcode 852 https://leetcode.com/problems/peak-index-in-a-mountain-array/
 */

public class PeakIndexInMoutainArray {

    // arr = [1,2,3,5,7,6,3,2] => bitonic array => first increasing then decreasing

    public static void main(String[] args) {
        int[] arr = { 1, 2, 1, 3, 5, 6, 4 };
        int res = peakIndexInMountainArray(arr);
        System.out.println(res);

    }

    static int peakIndexInMountainArray(int[] arr) {
        int start = 0;
        int end = arr.length - 1;

        while (start != end) {
            int mid = start + (end - start) / 2;

            if (arr[mid] > arr[mid + 1]) {
                end = mid;
            } else {
                start = mid + 1;
            }
        }

        return start;

    }
}
