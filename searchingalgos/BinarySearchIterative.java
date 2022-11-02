package searchingalgos;

/*
 works on the principle of divide and conquer. For this algorithm to work properly,
 the data collection should be in the sorted form.
 Time complexity Log(N)
 */
class BinarySearchIterative {

  public static void binarySearch(int val, int arr[]) {
    int low = 0;
    int high = arr.length - 1; // array is sorted
    while (low <= high) {
      int mid = (low + high) / 2;
      if (arr[mid] < val) {
        low = mid + 1;
        continue;
      } else if (arr[mid] > val) {
        high = mid - 1;
        continue;
      } else if (arr[mid] == val) {
        System.out.println("value found at the index " + mid);
        break;
      }
    }
  }

  public static void main(String args[]) {
    // giving sorted input array
    int[] arr = { 1, 4, 6, 7, 8, 9, 12, 17, 23, 19 };
    binarySearch(12, arr);
  }
}
