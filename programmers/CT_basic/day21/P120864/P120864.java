package programmers.CT_basic.day21.P120864;
/**
 * Class: P120864
 *
 * @author lyckabc
 * @date 2024-08-09 07:59
 * Copyright (c) 2024 lyckabc
 * @see <a href="https://github.com/lyckabc">GitHub Repository</a>
 */
public class P120864 {
    public static void main(String[] args) {
        Solution sol = new Solution();
        String my_string = "aAb1B2cC34oOp";

        long startTime = System.nanoTime();
        System.out.println(sol.solution(my_string));
        long endTime = System.nanoTime();
        System.out.printf("method speed: %.6f ms%n", (endTime - startTime) / 1_000_000.0);

    }
}
class Solution {
    public int solution(String my_string) {
        int answer = 0;
        int tmpN = 0;
        
        for (char c : my_string.toCharArray()) {
            if (Character.isDigit(c)) {
                tmpN = tmpN * 10 + (c - '0');
            } else {
                answer += tmpN;
                tmpN = 0;
            }
        }

        answer += tmpN;
        return answer;
    }
}
/*
class Solution {
    public int solution(String my_string) {
        int answer = 0;

        String[] str = my_string.replaceAll("[a-zA-Z]", " ").split(" ");

        for(String s : str){
            if(!s.equals("")) answer += Integer.valueOf(s);
        }

        return answer;
    }
}
 */