/******************************************************
 **                                                  **
 **        99_coding_exam                                 **
 **        PACKAGE_NAME                    **
 **        Made by Toji                              **
 **        1/3/2024  4:29 AM                       **
 **        https://github.com/lyckabc                **
 **                                                  **
 ******************************************************/

package B1890;
import java.util.*;
import java.io.*;

public class B1890_jump {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer tn = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(tn.nextToken());
        int[][] board = new int[N][N];

        for (int i = 0; i < N; i++) {
            tn = new StringTokenizer(br.readLine());
            for (int j = 0; j < N; j++) {
                board[i][j] = Integer.parseInt(tn.nextToken());
            }
        }

        Solution sol = new Solution();
        System.out.println(sol.solution(board, N));
    }
}
class Solution {
    public long solution(int[][] board, int N) {
        long[][] dp = new long[N][N];
        dp[0][0] = 1;

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if (dp[i][j] == 0 || (i == N - 1 && j == N - 1)) continue;

                int jump = board[i][j];

                if (i + jump < N) {
                    dp[i + jump][j] += dp[i][j];
                }

                if (j + jump < N) {
                    dp[i][j + jump] += dp[i][j];
                }
            }
        }
        return dp[N - 1][N - 1];
    }
}