class Solution {
    public int[][] flipAndInvertImage(int[][] image) {

        for (int i = 0; i < image.length; i++) {

            int s = 0;
            int e = image[i].length - 1;

            while (s <= e) {

                int temp = image[i][s] ^ 1;

                image[i][s] = image[i][e] ^ 1;

                image[i][e] = temp;

                s++;
                e--;
            }
        }

        return image;
    }
}