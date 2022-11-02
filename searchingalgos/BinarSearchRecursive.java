package searchingalgos;

/*
 works on the principle of divide and conquer. For this algorithm to work properly,
 the data collection should be in the sorted form.
 Time complexity Log(N)
 */
class BinarySearchRecursive {
    // input array arr is sorted
    static int binarySearch(int arr[], int val, int low, int high) {
        int mid = (low + high) / 2;
        if (mid == val) {
            return mid;
        } else if (mid < val) {
            return binarySearch(arr, val, mid + 1, high);
        } else {
            return binarySearch(arr, val, low, mid - 1);
        }
    }

    public static void main(String[] args) {
        // giving sorted array input
        int[] arr = { 1, 2, 3, 4, 5, 567, 899 };
        int low = 0;
        int high = arr.length - 1;
        int index = binarySearch(arr, 3, low, high);
        System.out.println("Element found at the index " + index);

    }
}