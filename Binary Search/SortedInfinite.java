public class SortedInfinite {

    public static void main(String[] args) {
        int arr[] = new int[] { 3, 5, 7, 9, 10, 90,
                100, 130, 140, 160, 170 };
        int target = 140;
        int ans = position(arr, target);
        System.out.println(ans);

    }

    static int position(int nums[], int target) {
        int start = 0;
        int end = 1;

        while (target > nums[end]) {
            int newStart = end + 1;
            // end = previous end + sizeofbox * 2
            end = end + (end - start + 1) * 2;
            start = newStart;
        }

        return binarySearch(nums, target, start, end);

    }

    static int binarySearch(int[] arr, int target, int start, int end) {

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