class Solution {
    public char findTheDifference(String s, String t) {
        char answer = 0;

        for (char ch : s.toCharArray()) {
            answer ^= ch;
        }

        for (char ch : t.toCharArray()) {
            answer ^= ch;
        }

        return answer;
    }
}