class Solution {
    public int compress(char[] chars) {

        int read = 0;
        int write = 0;

        while (read < chars.length) {

            char current = chars[read];

            int count = 0;

            while (read < chars.length && chars[read] == current) {
                read++;
                count++;
            }

            chars[write] = current;
            write++;

            if (count > 1) {

                String countString = String.valueOf(count);

                for (int i = 0; i < countString.length(); i++) {
                    chars[write] = countString.charAt(i);
                    write++;
                }
            }
        }

        return write;
    }
}