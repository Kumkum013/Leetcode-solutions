class Solution {
    public int hammingDistance(int x, int y) {
        String a = String.format("%32s",
                Integer.toBinaryString(x)).replace(' ', '0');

        String b = String.format("%32s",
                Integer.toBinaryString(y)).replace(' ', '0');

        int count = 0;

        for (int i = 0; i < 32; i++) {
            if (a.charAt(i) != b.charAt(i)) {
                count++;
            }
        }

        return count;
    }
}