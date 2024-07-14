/******************************************************
 **                                                  **
 **        99_coding_exam                                 **
 **        PACKAGE_NAME                    **
 **        Made by Toji                              **
 **        1/2/2024  7:29 PM                       **
 **        https://github.com/lyckabc                **
 **                                                  **
 ******************************************************/
package B2167;
import java.util.*;
import java.io.*;

public class B2167_arr2dSum {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Solution sol = new Solution();
        StringTokenizer tn = new StringTokenizer(br.readLine(), " ");
        int N = Integer.parseInt(tn.nextToken());
        int M = Integer.parseInt(tn.nextToken());
        int[][] A = new int[N][M];
        for (int i = 0; i < N; i++) {
            tn = new StringTokenizer(br.readLine());
            for (int j = 0; j < M; j++) {
                A[i][j] = Integer.parseInt(tn.nextToken());
            }
        }
        int K = Integer.parseInt(br.readLine());
        int[] B = new int[4];
        int arrNum = 4;
        for (int i = 0; i < K; i++) {
            tn = new StringTokenizer(br.readLine());
            Arrays.fill(B,0);
            for (int j = 0; j < 4; j++) {
                B[j] = Integer.parseInt(tn.nextToken());
            }
            System.out.println(sol.solution(A,B));
        }
    }
}

class Solution {
    public int solution (int[][] A,int[] B) {
        int sum = 0;
        for (int i = B[0]-1; i < B[2]; i++) {
            for (int j = B[1]-1; j < B[3]; j++) {
                sum +=A[i][j];
            }
        }
        return sum;
    }
}