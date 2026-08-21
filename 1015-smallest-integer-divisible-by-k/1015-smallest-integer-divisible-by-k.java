class Solution {
    public int smallestRepunitDivByK(int k) {

        // A number containing only 1s
        // can never be divisible by 2 or 5.
        if (k % 2 == 0 || k % 5 == 0) {
            return -1;
        }

        int remainder = 0;

        for (int length = 1; length <= k; length++) {

            remainder = (remainder * 10 + 1) % k;

            if (remainder == 0) {
                return length;
            }
        }

        return -1;
    }
}