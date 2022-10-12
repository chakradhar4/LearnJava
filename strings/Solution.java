class Solution {
    static int pivotIndex(int[] nums) {
        int total = 0, left = 0;
        for (int n : nums)
            total += n;
        for (int i = 0; i < nums.length; i++) {
            total -= nums[i];
            if (left == total)
                return i;
            left += nums[i];
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] num = {1,7,3,6,5,6};
        int a = pivotIndex(num);
        System.out.println(a);
    }
}