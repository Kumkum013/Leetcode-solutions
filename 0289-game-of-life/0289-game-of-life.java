class Solution {
    public void gameOfLife(int[][] board) {

        int m = board.length;
        int n = board[0].length;

        for (int i = 0; i < m; i++) {

            for (int j = 0; j < n; j++) {

                int liveNeighbors = 0;

                for (int r = i - 1; r <= i + 1; r++) {

                    for (int c = j - 1; c <= j + 1; c++) {

                        if (r == i && c == j) {
                            continue;
                        }

                        if (r >= 0 && r < m &&
                            c >= 0 && c < n) {

                            if (board[r][c] == 1 ||
                                board[r][c] == 2) {

                                liveNeighbors++;
                            }
                        }
                    }
                }

                if (board[i][j] == 1) {

                    if (liveNeighbors == 2 ||
                        liveNeighbors == 3) {

                        board[i][j] = 1;

                    } else {

                        board[i][j] = 2;
                    }

                } else if (board[i][j] == 0) {

                    if (liveNeighbors == 3) {

                        board[i][j] = 3;
                    }
                }
            }
        }

        for (int i = 0; i < m; i++) {

            for (int j = 0; j < n; j++) {

                if (board[i][j] == 2) {

                    board[i][j] = 0;

                } else if (board[i][j] == 3) {

                    board[i][j] = 1;
                }
            }
        }
    }
}