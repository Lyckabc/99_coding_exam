package programmers.CT_foundation.day17.P181871;
/**
 * Class: P181871
 *
 * @author lyckabc
 * @date 2024-07-31 12:02
 * Copyright (c) 2024 lyckabc
 * @see <a href="https://github.com/lyckabc">GitHub Repository</a>
 */
public class P181871 {
    public static void main(String[] args) {
        Solution sol = new Solution();
        String pat = "ana";
        String myString = "banana";

        long startTime = System.nanoTime();
        System.out.println(sol.solution(myString, pat));
        long endTime = System.nanoTime();
        System.out.printf("method speed: %.6f ms%n", (endTime - startTime) / 1_000_000.0);

    }
}
class Solution {
    public int solution(String myString, String pat) {
        int answer = 0;
        int lenStr = myString.length();
        for (int i = 0; i < lenStr; i++) {
            if (myString.substring(0,lenStr - i).endsWith(pat)) {
                answer++;
            }
        }
        return answer;
    }
}
/*
class Solution {
    public int solution(String myString, String pat) {
        int cnt = 0;
        for(int i=0; i<myString.length(); i++) {
            if(myString.substring(i).startsWith(pat)){
                cnt++;
            }
        }
        return cnt;
    }
}
 */
/*
class Solution {
    public int solution(String myString, String pat) {

        int idx = myString.indexOf(pat);
        return idx == -1 ? 0 : (1 + solution(myString.substring(idx + 1), pat));
    }
}
 */