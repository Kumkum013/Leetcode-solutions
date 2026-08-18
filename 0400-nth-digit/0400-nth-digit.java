class Solution {
    public int findNthDigit(int n) {
      int digitLength =1;
      long count = 9;
      long start = 1;

      // find the range containing the nth digit

      while(n > digitLength * count)
      {
        n -= digitLength * count;
        digitLength++;
        count = count * 10;
        start = start * 10;
      } 
      // find actual number

      long number = start + (n-1) / digitLength;

      // find digit insid that number
      int index = (int) ((n-1) % digitLength);
    return String.valueOf(number).charAt(index) - '0';
    }
}