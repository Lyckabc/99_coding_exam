package programmers.CT_basic.day21.P120868;
/**
 * Class: P120868
 *
 * @author lyckabc
 * @date 2024-08-09 09:19
 * Copyright (c) 2024 lyckabc
 * @see <a href="https://github.com/lyckabc">GitHub Repository</a>
 */
public class P120868 {
    public static void main(String[] args) {
        Solution sol = new Solution();
        int[] sides = {1,2};

        long startTime = System.nanoTime();
        System.out.println(sol.solution(sides));
        long endTime = System.nanoTime();
        System.out.printf("method speed: %.6f ms%n", (endTime - startTime) / 1_000_000.0);

    }
}
class Solution {
    public int solution(int[] sides) {
        int answer = 0;
        int minN = Math.min(sides[0],sides[1]);
        int maxN = Math.max(sides[0],sides[1]);
        for (int i = maxN - minN + 1 ; i < maxN + minN; i++) {
            answer++;
        }
        // answer += (maxN + minN) - (maxN - minN + 1);
        return answer;
    }
}
/*
class Solution {
    public int solution(int[] sides) {
        int answer = 0;
        int max = Math.max(sides[0], sides[1]);
        int min = Math.min(sides[0], sides[1]);

        answer += min * 2 - 1;

        return answer;
    }
}
 */