package programmers.CT_foundation.day10.P181905;

/**
 * Class: P181905
 *
 * @author lyckabc
 * @date 2024-07-17 22:47
 *       Copyright (c) 2024 lyckabc
 * @see <a href="https://github.com/lyckabc">GitHub Repository</a>
 */
public class P181905 {
    public static void main(String[] args) {
        Solution sol = new Solution();
        String my_string = "Progra21Sremm3";
        int s = 6;
        int e = 12;

        long startTime = System.nanoTime();
        System.out.println(sol.solution(my_string, s, e));
        long endTime = System.nanoTime();
        System.out.printf("method speed: %.6f ms%n", (endTime - startTime) / 1_000_000.0);

    }
}

class Solution {
    public String solution(String my_string, int s, int e) {
        StringBuilder subStr = new StringBuilder(my_string.substring(s, e + 1));
        subStr.reverse();

        String answer = my_string.substring(0, s) + subStr.toString() + my_string.substring(e + 1);
        
        return answer;
    }
}
/*
class Solution {

    public String solution(String my_string, int s, int e) {

        char[] spell = my_string.toCharArray();

        for (int i = s; i < e; i++, e--) {
            char tmp = spell[i];
            spell[i] = spell[e];
            spell[e] = tmp;
        }

        String answer = "";
        for (char c : spell) {
            answer += c;
        }
        return answer;
    }
}
 */

/*
class Solution {
    public String solution(String my_string, int s, int e) {
        StringBuilder answer = new StringBuilder(my_string.substring(s, e + 1));
        answer.reverse();
        return my_string.substring(0, s) + answer + my_string.substring(e + 1);
    }
}
 */

 /*
class Solution {
    public String solution(String my_string, int s, int e) {
        String answer = my_string.substring(0,s);
        String subStr = "";
        for (int i = e; i >= s; i--) {
            subStr += my_string.charAt(i);
        }
        answer += subStr;
        answer += my_string.substring(e + 1);
        return answer;
    }
}
  */