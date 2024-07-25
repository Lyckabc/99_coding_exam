package programmers.CT_foundation.day16.P181876;
/**
 * Class: P181876
 *
 * @author lyckabc
 * @date 2024-07-25 10:33
 * Copyright (c) 2024 lyckabc
 * @see <a href="https://github.com/lyckabc">GitHub Repository</a>
 */
public class P181876 {
    public static void main(String[] args) {
        Solution sol = new Solution();
        String s = "aBcDeFg";

        long startTime = System.nanoTime();
        System.out.println(sol.solution(s));
        long endTime = System.nanoTime();
        System.out.printf("method speed: %.6f ms%n", (endTime - startTime) / 1_000_000.0);

    }
}
class Solution {
    public String solution(String myString) {
        String answer = "";
        char[] charArr = myString.toCharArray();
        for (int i = 0; i < charArr.length; i++) {
            answer += Character.toLowerCase(charArr[i]);
        }
        return answer;
    }
}
/*
class Solution {
    public String solution(String myString) {

        return myString.toLowerCase();
    }
}
 */
/*
class Solution {
    public String solution(String myString) {
        String answer = "";
        for(char c:myString.toCharArray()){
            if(c>='A'&&c<='Z'){
                answer+=(char)((int)c+32);
            }
            else{answer+=c;}
        }
        return answer;
    }
}
 */
