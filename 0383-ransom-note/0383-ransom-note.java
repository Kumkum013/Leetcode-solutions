class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        StringBuilder available = new StringBuilder(magazine);
        for(int i=0;i<ransomNote.length();i++)
        {
            char ch= ransomNote.charAt(i);
            int index = available.indexOf(String.valueOf(ch));
            if(index == -1)
            {
                return false;
            }
            available.deleteCharAt(index);
        }
        return true;
    }
}