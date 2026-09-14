import java.util.*;

class Solution {
    public int subarraysDivByK(int[] nums, int k) {

        HashMap<Integer, Integer> map = new HashMap<>();

        map.put(0, 1);

        int remainder = 0;
        int count = 0;

        for (int num : nums) {

            remainder = (remainder + num) % k;

            if (remainder < 0) {
                remainder += k;
            }

            if (map.containsKey(remainder)) {

                count += map.get(remainder);

                map.put(remainder, map.get(remainder) + 1);

            } else {

                map.put(remainder, 1);
            }
        }

        return count;
    }
}