/****************************************************
 **                                                 **
 **        99_coding_exam                          **
 **        B10807                                  **
 **        Made by Toji                          **
 **        12/22/2023 :4:21 AM                         **
 **        https://github.com/lyckabc               **
 **                                                 **
 ****************************************************/
package B10807;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class B10807 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Solution sol = new Solution();

        int N = Integer.parseInt(br.readLine());
        StringTokenizer tn = new StringTokenizer(br.readLine(), " ");
        int[] A = new int[N];
        for (int i = 0; i < N; i++) {
            A[i] = Integer.parseInt(tn.nextToken());
        }
        int v = Integer.parseInt(br.readLine());


        System.out.println(sol.solution(A,v));
    }
}

class Solution {
    public int solution(int[] A, int v) {
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < A.length; i++) {
            if (A[i] == v) {
                stack.push(v);
            }
        }

        return stack.size();
    }
}
