package programmers.CT_basic.day13.P120889;
/**
 * Class: P120889
 *
 * @author lyckabc
 * @date 2024-07-19 23:45
 * Copyright (c) 2024 lyckabc
 * @see <a href="https://github.com/lyckabc">GitHub Repository</a>
 */
import java.util.Arrays;
public class P120889 {
    public static void main(String[] args) {
        Solution sol = new Solution();
        int[] sides = {199, 72, 222};

        long startTime = System.nanoTime();
        System.out.println(sol.solution(sides));
        long endTime = System.nanoTime();
        System.out.printf("method speed: %.6f ms%n", (endTime - startTime) / 1_000_000.0);

    }
}
class Solution {
    public int solution(int[] sides) {
        int answer = 0;
        Arrays.sort(sides);
        if (sides[0] + sides[1] > sides[2]) {
            answer = 1;
        } else {
            answer = 2;
        }
        return answer;
    }
}
/*
import java.util.Arrays;
class Solution {
    public int solution(int[] sides) {
        int answer = 0;
        Arrays.sort(sides);
        return sides[2] >= sides[0]+sides[1] ? 2 : 1;
    }
}
 */
/*
class Solution {
    public int solution(int[] sides) {
        int A = sides[0] + sides[1];
        int B = sides[1] + sides[2];
        int C = sides[0] + sides[2];

        if(A <= sides[2] || B <= sides[0] || C <= sides[1]) return 2;
        else return 1;
    }
}
 */