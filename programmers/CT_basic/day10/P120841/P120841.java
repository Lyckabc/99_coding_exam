package programmers.CT_basic.day10.P120841;
/**
 * Class: P120841
 *
 * @author lyckabc
 * @date 2024-07-18 00:22
 * Copyright (c) 2024 lyckabc
 * @see <a href="https://github.com/lyckabc">GitHub Repository</a>
 */
public class P120841 {
    public static void main(String[] args) {
        Solution sol = new Solution();
        int[] dot = {2, 4};

        long startTime = System.nanoTime();
        System.out.println(sol.solution(dot));
        long endTime = System.nanoTime();
        System.out.printf("method speed: %.6f ms%n", (endTime - startTime) / 1_000_000.0);

    }
}
class Solution {
    public int solution(int[] dot) {
        int answer = 0;
        int x = dot[0];
        int y = dot[1];
        if (x > 0 && y > 0) {
            answer = 1;
        } else if (x < 0 && y > 0) {
            answer = 2;
        } else if (x < 0 && y < 0) {
            answer = 3;
        } else {
            answer = 4;
        }
        return answer;
    }
}
/*
class Solution {
    public int solution(int[] dot) {
        int answer = 0;
        if(dot[0] > 0) 
            if(dot[1] > 0) answer = 1;
            else answer = 4;
        else 
            if(dot[1] > 0) answer = 2;
            else answer = 3;


        return answer;
    }
}
 */
/*
class Solution {
    public int solution(int[] dot) {
        int xParam = dot[0] < 0 ? 1 : 0;
        int yParam = dot[1] < 0 ? 2 : 0;

        return 1 + ((xParam | yParam) ^ (yParam >> 1));
    }
}
 */