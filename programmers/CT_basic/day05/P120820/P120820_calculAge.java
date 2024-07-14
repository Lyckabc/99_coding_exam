package P120820;
/**
 * Class: P120820_calculAge
 *
 * @author lyckabc
 * @date 2024-07-14 18:58
 * Copyright (c) 2024 lyckabc
 * @see <a href="https://github.com/lyckabc">GitHub Repository</a>
 */
public class P120820_calculAge {
    public static void main(String[] args) {
        Solution sol = new Solution();
        int age = 40;
        // 2022 standard age
        System.out.println(sol.solution(age));
    }
}

class Solution {
    public int solution(int age) {
        int answer = 0;
        int currentYear = 2022;
        answer = currentYear - age + 1;
        return answer;
    }
}