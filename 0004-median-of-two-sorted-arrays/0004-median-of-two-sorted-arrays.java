class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {

        // Always binary search on the smaller array
        if (nums1.length > nums2.length) {
            return findMedianSortedArrays(nums2, nums1);
        }

        int m = nums1.length;
        int n = nums2.length;

        int low = 0;
        int high = m;

        // Number of elements required on the left side
        int leftElements = (m + n + 1) / 2;

        while (low <= high) {

            // Partition nums1
            int i = (low + high) / 2;

            // Partition nums2
            int j = leftElements - i;

            // Elements immediately around the partitions
            int nums1Left;
            int nums1Right;
            int nums2Left;
            int nums2Right;

            // If partition is at the beginning of nums1
            if (i == 0) {
                nums1Left = Integer.MIN_VALUE;
            } else {
                nums1Left = nums1[i - 1];
            }

            // If partition is at the end of nums1
            if (i == m) {
                nums1Right = Integer.MAX_VALUE;
            } else {
                nums1Right = nums1[i];
            }

            // If partition is at the beginning of nums2
            if (j == 0) {
                nums2Left = Integer.MIN_VALUE;
            } else {
                nums2Left = nums2[j - 1];
            }

            // If partition is at the end of nums2
            if (j == n) {
                nums2Right = Integer.MAX_VALUE;
            } else {
                nums2Right = nums2[j];
            }

            // Correct partition found
            if (nums1Left <= nums2Right &&
                nums2Left <= nums1Right) {

                // Odd number of elements
                if ((m + n) % 2 == 1) {
                    return Math.max(nums1Left, nums2Left);
                }

                // Even number of elements
                int maxLeft = Math.max(nums1Left, nums2Left);
                int minRight = Math.min(nums1Right, nums2Right);

                return (maxLeft + minRight) / 2.0;
            }

            // nums1Left is too large
            else if (nums1Left > nums2Right) {
                high = i - 1;
            }

            // nums1Left is too small
            else {
                low = i + 1;
            }
        }

        // This line should never execute for valid input
        return 0.0;
    }
}