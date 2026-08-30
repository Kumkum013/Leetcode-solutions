class Solution {
    public boolean isRectangleCover(int[][] rectangles) {

        int n = rectangles.length;

        // Check every pair of rectangles
        for (int i = 0; i < n; i++) {

            for (int j = i + 1; j < n; j++) {

                if (overlap(rectangles[i], rectangles[j])) {
                    return false;
                }
            }
        }

        long area = 0;

        int minX = Integer.MAX_VALUE;
        int minY = Integer.MAX_VALUE;
        int maxX = Integer.MIN_VALUE;
        int maxY = Integer.MIN_VALUE;

        for (int[] r : rectangles) {

            int x1 = r[0];
            int y1 = r[1];
            int x2 = r[2];
            int y2 = r[3];

            area += (long) (x2 - x1) * (y2 - y1);

            minX = Math.min(minX, x1);
            minY = Math.min(minY, y1);
            maxX = Math.max(maxX, x2);
            maxY = Math.max(maxY, y2);
        }

        long bigArea =
                (long) (maxX - minX) * (maxY - minY);

        return area == bigArea;
    }

    private boolean overlap(int[] a, int[] b) {

        int left = Math.max(a[0], b[0]);
        int right = Math.min(a[2], b[2]);

        int bottom = Math.max(a[1], b[1]);
        int top = Math.min(a[3], b[3]);

        return left < right && bottom < top;
    }
}