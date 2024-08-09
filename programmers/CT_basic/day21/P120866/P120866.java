package programmers.CT_basic.day21.P120866;

import java.util.Arrays;

/**
 * Class: P120866
 *
 * @author lyckabc
 * @date 2024-08-09 08:37
 * Copyright (c) 2024 lyckabc
 * @see <a href="https://github.com/lyckabc">GitHub Repository</a>
 */
import java.util.*;
public class P120866 {
    public static void main(String[] args) {
        Solution sol = new Solution();
        int[][] board = {{0, 0, 0, 0, 0}, {0, 0, 0, 0, 0}, {0, 0, 0, 0, 0}, {0, 0, 1, 0, 0}, {0, 0, 0, 0, 0}};

        long startTime = System.nanoTime();
        System.out.println(sol.solution(board));
        // System.out.println((Arrays.deepToString(sol.solution(board))));
        long endTime = System.nanoTime();
        System.out.printf("method speed: %.6f ms%n", (endTime - startTime) / 1_000_000.0);

    }
}
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
        for (int k = i - 1; k < lenB; k++) {
            for (int k2 = j - 1; k2 < lenB; k2++) {
                if ((k >= i - 1 && k <= i + 1) && (k2 >= j - 1 && k2 <= j + 1)) board[k][k2] = 1;
            }
        }
        return board;
    }
}