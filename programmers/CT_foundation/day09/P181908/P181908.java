package programmers.CT_foundation.day09.P181908;
/**
 * Class: P181908
 *
 * @author lyckabc
 * @date 2024-07-16 13:29
 * Copyright (c) 2024 lyckabc
 * @see <a href="https://github.com/lyckabc">GitHub Repository</a>
 */
public class P181908 {
    public static void main(String[] args) {
        Solution sol = new Solution();
        String my_string = "banana";
        String is_suffix = "ana";

        long startTime = System.nanoTime();
        System.out.println(sol.solution(my_string, is_suffix));
        long endTime = System.nanoTime();
        System.out.printf("method speed: %.6f ms%n", (endTime - startTime) / 1_000_000.0);

    }
}
class Solution {
    public int solution(String my_string, String is_suffix) {
        int answer = 0;
        if (my_string.endsWith(is_suffix)) {
            answer = 1;
        }
        return answer;
    }
}

/*
best solution
class Solution {
    public int solution(String my_string, String is_suffix) {
        int answer = 0;
        for(int i=0;i<my_string.length();i++){
            if(is_suffix.equals(my_string.substring(i))){
                answer = 1;
                break;
            }
        }
        return answer;
    }
}
*/