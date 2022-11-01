package searchingalgos;

/* It sequentially checks each element of the list for the target value until a match is found 
or until all the elements have been searched.
 */
class LinearSearch {
    public static void linearSearch(int val, int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == val) {
                System.out.println("element " + val + " found at index " + i);
                return;
            }
        }
        System.out.println("Element not found in the list");
        return;
    }

    public static void main(String[] args) {
        int val = 33;
        int[] arr = { 1, 78, 43, 90, 2, 134, 7532, 10 };
        linearSearch(val, arr);
    }
}