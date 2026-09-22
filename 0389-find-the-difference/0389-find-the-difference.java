// class Solution {
//     public char findTheDifference(String s, String t) {
//         char answer = 0;

//         for (char ch : s.toCharArray()) {
//             answer ^= ch;
//         }

//         for (char ch : t.toCharArray()) {
//             answer ^= ch;
//         }

//         return answer;
//     }
// }


// hashing
import java.util.HashMap; 
 
class Solution { 
    public char findTheDifference(String s, String t) { 
 
        HashMap<Character, Integer> map = new HashMap<>(); 
 
        // Count characters in s 
        for (int i = 0; i < s.length(); i++) { 
 
            char ch = s.charAt(i); 
 
            map.put(ch, map.getOrDefault(ch, 0) + 1); 
        } 
 
        // Compare characters in t 
        for (int i = 0; i < t.length(); i++) { 
 
            char ch = t.charAt(i); 
 
            if (!map.containsKey(ch) || map.get(ch) == 0) { 
                return ch; 
            } 
 
            map.put(ch, map.get(ch) - 1); 
        } 
 
        return ' '; 
    } 
} 