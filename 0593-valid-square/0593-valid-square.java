class Solution {
    public boolean validSquare(int[] p1, int[] p2, int[] p3, int[] p4) {
        int[] distances = {
            distance(p1,p2),
            distance(p1,p3),
            distance(p1,p4),
            distance(p2,p3),
            distance(p2,p4),
            distance(p3,p4)
        };
        Arrays.sort(distances);


        // First 4 must be equal and positive
        // Last 2 must be equal
        // Diagonal must be greater than side

        return distances[0] > 0 && 
        distances[0] == distances[1] && 
        distances[1] == distances[2] &&
        distances[2] == distances[3] &&
        distances[4] == distances[5] &&
        distances[3] < distances[4];
        
    }

    private int distance(int[] a, int[] b)
    {
        int dx = a[0] - b[0];
        int dy = a[1] - b[1];
        return dx * dx + dy * dy;
    }

}