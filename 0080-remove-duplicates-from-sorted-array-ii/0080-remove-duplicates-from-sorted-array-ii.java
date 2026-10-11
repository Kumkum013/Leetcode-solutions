class Solution {
    public int removeDuplicates(int[] nums) {
        int n = nums.length;
        int[] temp = new int[n];
        int k = 0;
        int count = 0;
        int previous = 0;

        for (int i = 0; i < n; i++) {
            if (i == 0 || nums[i] != previous) {
                count = 1;
            } else {
                count++;
            }

            if (count <= 2) {
                temp[k] = nums[i];
                k++;
            }

            previous = nums[i];
        }

        for (int i = 0; i < k; i++) {
            nums[i] = temp[i];
        }

        return k;
    }
}