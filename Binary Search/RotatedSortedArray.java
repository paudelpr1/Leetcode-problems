public class RotatedSortedArray {

    public static void main(String[] args) {
        int[] arr = { 5, 1, 3 };
        int ans = search(arr, 5);
        System.out.println(ans);

    }

    static int search(int[] nums, int target) {
        int peakElement = highestIndex(nums);
        int ascCheck = binarySearch(nums, 0, peakElement, target);
        int res;
        if (ascCheck == -1) {
            res = binarySearch(nums, peakElement + 1, nums.length - 1, target);
        } else {
            return ascCheck;
        }

        return res;
    }

    static int highestIndex(int[] arr) {
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (mid < end && arr[mid] > arr[mid + 1]) {
                return mid;
            } else if (mid > start && arr[mid] < arr[mid - 1]) {
                return mid - 1;
            }

            else if (arr[start] >= arr[mid]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }

        }

        return -1;
    }

    static int binarySearch(int[] arr, int start, int end, int target) {
        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (target > arr[mid]) {
                start = mid + 1;
            }

            else if (target < arr[mid]) {
                end = mid - 1;
            } else if (target == arr[mid]) {
                return mid;
            }
        }
        return -1;
    }
}
