package INFO6205_MidTerm;

import java.util.Arrays;

class FirstIndex {
    //Time Complexity : O(log N) considering there are N elements in the array
    //Space Complexity : O(1) since used only few variables
    public static int getIndex(int[] nums, int x) {
        if (nums == null || nums.length == 0) {
            return -1;
        }
        return getIndexRecursion(nums, 0, nums.length - 1, x);
    }

    private static int getIndexRecursion(int[] nums, int low, int high, int x) {
        if (low > high || nums[low] > x || nums[high] < x) {
            return -1;
        }
        if (nums[low] == x) {
            return low;
        }
        int mid = (low + high) / 2;
        if (nums[mid] == x) {
            return getIndexRecursion(nums, low, mid, x);
        } else if (nums[mid] < x) {
            return getIndexRecursion(nums, mid + 1, high, x);
        } else {
            return getIndexRecursion(nums, low, mid - 1, x);
        }
    }

    public static void main(String[] args) {
        int[] A = {2, 4, 4, 4, 6, 7, 7, 7, 8, 9, 9, 9};
        System.out.println(Arrays.toString(A));
        int x = 7;
        System.out.println("First Index of " + x + " is : " + getIndex(A, x));
    }
}
