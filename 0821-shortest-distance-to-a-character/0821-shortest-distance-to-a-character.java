class Solution {
    public int[] shortestToChar(String s, char c) {
        int n = s.length();
        int[] answer = new int[n];

        for (int i = 0; i < n; i++) {
            int minDistance = Integer.MAX_VALUE;

            for (int j = 0; j < n; j++) {
                if (s.charAt(j) == c) {
                    int distance = Math.abs(i - j);
                    minDistance = Math.min(minDistance, distance);
                }
            }

            answer[i] = minDistance;
        }

        return answer;
    }
}