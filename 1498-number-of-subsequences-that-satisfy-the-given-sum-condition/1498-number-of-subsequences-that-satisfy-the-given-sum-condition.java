import java.util.Arrays;

class Solution {

    static final int MOD = 1000000007;

    public int numSubseq(int[] nums, int target) {

        Arrays.sort(nums);

        int left = 0;
        int right = nums.length - 1;

        long answer = 0;

        long[] power = new long[nums.length];

        power[0] = 1;

        for (int i = 1; i < nums.length; i++) {
            power[i] = (power[i - 1] * 2) % MOD;
        }

        while (left <= right) {

            if (nums[left] + nums[right] <= target) {

                answer = (answer + power[right - left]) % MOD;

                left++;

            } else {

                right--;
            }
        }

        return (int) answer;
    }
}