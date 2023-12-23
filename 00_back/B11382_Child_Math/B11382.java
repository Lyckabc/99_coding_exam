import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/****************************************************
 **                                                 **
 **        99_coding_exam                          **
 **        B11382                                  **
 **        Made by Toji                          **
 **        12/23/2023 :11:29 PM                         **
 **        https://github.com/lyckabc               **
 **                                                 **
 ****************************************************/
public class B11382 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Solution sol = new Solution();
        long A,B,C;
        StringTokenizer tn = new StringTokenizer(br.readLine(), " ");
        A = Long.parseLong(tn.nextToken());
        B = Long.parseLong(tn.nextToken());
        C = Long.parseLong(tn.nextToken());

        System.out.println(sol.childMath(A,B,C));
    }
}
class Solution {
    public long childMath (long A, long B, long C) {
        return (A + B + C);
    }
}

