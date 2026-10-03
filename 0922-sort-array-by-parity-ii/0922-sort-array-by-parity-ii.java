class Solution {
    public int[] sortArrayByParityII(int[] nums) {

        int n = nums.length;

        int[] even = new int[n / 2];
        int[] odd = new int[n / 2];

        int e = 0;
        int o = 0;

        // Separate even and odd numbers
        for (int num : nums) {

            if (num % 2 == 0) {
                even[e] = num;
                e++;
            } else {
                odd[o] = num;
                o++;
            }
        }

        // Place them at their correct indices
        for (int i = 0; i < n / 2; i++) {

            nums[2 * i] = even[i];

            nums[2 * i + 1] = odd[i];
        }

        return nums;
    }
}