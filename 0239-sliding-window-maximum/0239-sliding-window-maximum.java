
import java.util.*;

class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {

        int n = nums.length;

        int[] ans = new int[n - k + 1];

        Deque<Integer> dq = new ArrayDeque<>();

        for (int i = 0; i < n; i++) {

            // Step 1: Remove elements outside the window
            if (!dq.isEmpty() && dq.peekFirst() <= i - k) {
                dq.removeFirst();
            }

            // Step 2: Remove smaller elements from the back
            while (!dq.isEmpty() && nums[dq.peekLast()] <= nums[i]) {
                dq.removeLast();
            }

            // Step 3: Add current index
            dq.addLast(i);

            // Step 4: Store maximum when window is complete
            if (i >= k - 1) {
                ans[i - k + 1] = nums[dq.peekFirst()];
            }
        }

        return ans;
    }
}
