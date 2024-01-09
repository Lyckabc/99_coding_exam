/******************************************************
 **                                                  **
 **        99_coding_exam                                 **
 **        PACKAGE_NAME                    **
 **        Made by Toji                              **
 **        1/2/2024  8:35 PM                       **
 **        https://github.com/lyckabc                **
 **                                                  **
 ******************************************************/
package B2003;
import java.util.*;
import java.io.*;

public class B2003_sumofVals {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Solution sol = new Solution();
        StringTokenizer tn = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(tn.nextToken());
        int M = Integer.parseInt(tn.nextToken());

        int[] A = new int[N];
        tn = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            A[i] = Integer.parseInt(tn.nextToken());
        }

        System.out.println(sol.solution(A, M));
    }
}
class Solution {
    public int solution (int[] A, int M) {
        int sum = 0;
        int cnt = 0;
        int len = A.length;
        for (int i = 0; i < len; i++) {
            sum = 0;
            for (int j = i; j < len; j++) {
                sum += A[j];
                if (sum == M) {
                    cnt++;
                } else if (sum > M) {
                    break;
                }
            }
        }
        return cnt;
    }
}


