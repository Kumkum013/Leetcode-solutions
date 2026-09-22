// class Solution {
//     public boolean canConstruct(String ransomNote, String magazine) {
//         StringBuilder available = new StringBuilder(magazine);
//         for(int i=0;i<ransomNote.length();i++)
//         {
//             char ch= ransomNote.charAt(i);
//             int index = available.indexOf(String.valueOf(ch));
//             if(index == -1)
//             {
//                 return false;
//             }
//             available.deleteCharAt(index);
//         }
//         return true;
//     }
// }


// using hashmap
import java.util.HashMap;

class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {

        HashMap<Character, Integer> map = new HashMap<>();

        // Store frequency of each character in magazine
        for (int i = 0; i < magazine.length(); i++) {

            char ch = magazine.charAt(i);

            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }

        // Use characters for ransomNote
        for (int i = 0; i < ransomNote.length(); i++) {

            char ch = ransomNote.charAt(i);

            if (!map.containsKey(ch) || map.get(ch) == 0) {
                return false;
            }

            map.put(ch, map.get(ch) - 1);
        }

        return true;
    }
}