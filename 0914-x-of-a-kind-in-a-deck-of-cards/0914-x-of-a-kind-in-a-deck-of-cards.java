class Solution {

    public boolean hasGroupsSizeX(int[] deck) {

        int[] count = new int[10000];

        for (int card : deck) {
            count[card]++;
        }

        int gcd = 0;

        for (int c : count) {

            if (c > 0) {
                gcd = gcd(gcd, c);
            }
        }

        return gcd > 1;
    }

    private int gcd(int a, int b) {

        while (b != 0) {

            int temp = b;
            b = a % b;
            a = temp;
        }

        return a;
    }
}