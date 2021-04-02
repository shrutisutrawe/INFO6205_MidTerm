package INFO6205_MidTerm;

import java.util.Arrays;

public class MaxConsecutiveNumber {
    //Time Complexity : O(N), considering there are N elements in the array.
    //Space Complexity : O(1) , few variables used.
    public static int getMaxConsecutiveOnes(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }
        int maxCount = 0, runningCount = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 1) {
                runningCount++;
                if (runningCount > maxCount) {
                    maxCount = runningCount;
                }
            } else {
                runningCount = 0;
            }
        }
        return maxCount;
    }

    public static void main(String[] args) {
        int[] A = {0, 1, 0, 1, 1, 0, 1, 1, 1, 0, 0, 0};
        System.out.println(Arrays.toString(A));
        System.out.println("Maximum Consecutive 1's are : " + getMaxConsecutiveOnes(A));
    }
}
