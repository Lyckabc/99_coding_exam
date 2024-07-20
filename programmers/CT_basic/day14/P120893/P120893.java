package programmers.CT_basic.day14.P120893;
/**
 * Class: P120893
 *
 * @author lyckabc
 * @date 2024-07-20 22:43
 * Copyright (c) 2024 lyckabc
 * @see <a href="https://github.com/lyckabc">GitHub Repository</a>
 */
public class P120893 {
    public static void main(String[] args) {
        Solution sol = new Solution();
        String my_string = "cccCCC";

        long startTime = System.nanoTime();
        System.out.println(sol.solution(my_string));
        long endTime = System.nanoTime();
        System.out.printf("method speed: %.6f ms%n", (endTime - startTime) / 1_000_000.0);

    }
}
class Solution {
    public String solution(String my_string) {
        String answer = "";
        for (int i = 0; i < my_string.length(); i++) {
            char c = my_string.charAt(i);
            if (Character.isUpperCase(c)) {
                answer += Character.toLowerCase(c);
            } else {
                answer += Character.toUpperCase(c);
            }
        }
        return answer;
    }
}
/*
import java.util.stream.Collectors;

class Solution {
    public String solution(String myString) {
        return myString
        .chars()
        .mapToObj(operand -> String.valueOf((char) (Character.isLowerCase(operand) ? Character.toUpperCase(operand) : Character.toLowerCase(operand))))
        .collect(Collectors
        .joining());
    }
}
 */
/*
class Solution {
    public String solution(String s) {
        String answer = "";

        for(int i=0;i<s.length();i++){
            if(s.charAt(i)>=97 && s.charAt(i)<=122){
                answer += (char)(s.charAt(i)-32);
            } else if(s.charAt(i)>=65 && s.charAt(i)<=90){
                answer += (char)(s.charAt(i)+32);
            } else {
                answer += s.charAt(i);
            }
        }

        return answer;
    }
}
 */