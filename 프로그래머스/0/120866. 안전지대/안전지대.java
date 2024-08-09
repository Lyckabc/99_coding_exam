class Solution {
    public int lenB;
    public int solution(int[][] board) {
        int answer = 0;
        lenB = board.length;
        int[][] dangerB = new int[lenB][lenB];
        for (int i = 0; i < lenB; i++) {
            for (int j = 0; j < lenB; j++) {
                if (board[i][j] == 1) cautionBoard(dangerB, i, j);
            }
        }
        for (int i = 0; i < lenB; i++) {
            for (int j = 0; j < lenB; j++) {
                if (dangerB[i][j] == 0) answer++;
            }
        }
        return answer;
    }
    public int[][] cautionBoard(int[][] board, int i, int j) {
        for (int k = 0; k < lenB; k++) {
            for (int k2 = 0; k2 < lenB; k2++) {
                if ((k >= i - 1 && k <= i + 1) && (k2 >= j - 1 && k2 <= j + 1)) board[k][k2] = 1;
            }
        }
        return board;
    }
}