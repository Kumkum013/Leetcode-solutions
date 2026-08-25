class Solution {
    public int maxPoints(int[][] points) {

        int n = points.length;

        if (n <= 2) {
            return n;
        }

        int answer = 2;

        for (int i = 0; i < n; i++) {

            for (int j = i + 1; j < n; j++) {

                int count = 2;

                for (int k = j + 1; k < n; k++) {

                    if (onSameLine(points[i], points[j], points[k])) {
                        count++;
                    }
                }

                answer = Math.max(answer, count);
            }
        }

        return answer;
    }

    private boolean onSameLine(int[] p1, int[] p2, int[] p3) {

        long x1 = p1[0];
        long y1 = p1[1];

        long x2 = p2[0];
        long y2 = p2[1];

        long x3 = p3[0];
        long y3 = p3[1];

        return (y2 - y1) * (x3 - x1)
             == (y3 - y1) * (x2 - x1);
    }
}