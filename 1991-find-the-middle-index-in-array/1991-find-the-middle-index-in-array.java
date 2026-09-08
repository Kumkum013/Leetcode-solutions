class Solution {
    public int findMiddleIndex(int[] nums) {

        for (int i = 0; i < nums.length; i++) {

            int leftSum = 0;
            int rightSum = 0;

            // Calculate left sum
            for (int j = 0; j < i; j++) {
                leftSum += nums[j];
            }

            // Calculate right sum
            for (int j = i + 1; j < nums.length; j++) {
                rightSum += nums[j];
            }

            // Check if both sums are equal
            if (leftSum == rightSum) {
                return i;
            }
        }

        return -1;
    }
}