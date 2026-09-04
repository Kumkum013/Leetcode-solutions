class Solution {
    public int findComplement(int num) {
        String binary = Integer.toBinaryString(num);
        StringBuilder result = new StringBuilder();
        for(char ch : binary.toCharArray()) {
            if(ch == '0')
            {
                result.append('1');
            }
            else 
            {
                result.append('0');
            }
        }
         return Integer.parseInt(result.toString(),2);
    }
}