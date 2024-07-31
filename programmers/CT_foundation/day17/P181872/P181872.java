package programmers.CT_foundation.day17.P181872;
/**
 * Class: P181872
 *
 * @author lyckabc
 * @date 2024-07-31 06:12
 * Copyright (c) 2024 lyckabc
 * @see <a href="https://github.com/lyckabc">GitHub Repository</a>
 */
public class P181872 {
    public static void main(String[] args) {
        Solution sol = new Solution();
        String pat = "a";
        String myString = "AAAAaaaA";

        long startTime = System.nanoTime();
        System.out.println(sol.solution(myString, pat));
        long endTime = System.nanoTime();
        System.out.printf("method speed: %.6f ms%n", (endTime - startTime) / 1_000_000.0);

    }
}
class Solution {
    public String solution(String myString, String pat) {
        String answer = "";
        int lenStr = myString.length();
        for (int i = lenStr; i >= 0; i--) {
            if (myString.substring(i).contains(pat)) {
                answer = myString.substring(0, i + pat.length());
                break;
            }
        }
        
        return answer;
    }
}
/*
class Solution {
    public String solution(String myString, String pat) {
        String answer = "";

        int idx = myString.lastIndexOf(pat);

        answer = myString.substring(0, idx) + pat;

        return answer;
    }
}
 */
/*
class Solution {

    public String solution(String myString, String pat) {
        String answer = "";

        for (int i = myString.length(); i >= 0; i--) {
            myString = myString.substring(0, i);
            if(myString.endsWith(pat)) {
                return myString;
            } 
        }
        return answer;
    }
}
 */