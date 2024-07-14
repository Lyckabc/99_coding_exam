/****************************************************
 **                                                 **
 **        99_coding_exam                          **
 **        B15649_NandM1                                  **
 **        Made by Toji                          **
 **        2024-03-07 :오후 10:49                         **
 **        https://github.com/lyckabc               **
 **                                                 **
 ****************************************************/
package B15649_NandM1;

import java.util.*;

public class B15649_NandM1 {
    public static void main(String[] args) {
        Solution sol = new Solution();
        int N = 4;
        int M = 3;
        String s = "abc";

        sol.solution(N,M);
    }
}
class Solution {
    static int[] arr = new int[10];
    static boolean[] isUsed = new boolean[10];
    static int n, m;

    static void solution(int N, int M){
        n = N;
        m = M;
        func(0);
    }
    static void func(int k) {
        if (k == m) { // m개를 모두 택했으면
            for (int i = 0; i < m; i++)
                System.out.print(arr[i] + " "); // arr에 기록해둔 수를 출력
            System.out.println();
            return;
        }

        for (int i = 1; i <= n; i++) { // 1부터 n까지의 수에 대해
            if (!isUsed[i]) { // 아직 i가 사용되지 않았으면
                arr[k] = i; // k번째 수를 i로 정함
                isUsed[i] = true; // i를 사용되었다고 표시
                func(k + 1); // 다음 수를 정하러 한 단계 더 들어감
                isUsed[i] = false; // k번째 수를 i로 정한 모든 경우에 대해 다 확인했으니 i를 이제 사용되지 않았다고 명시함.
            }
        }
    }
}


