/**
 * Class: P181929_multiple_sum
 *
 * @author lyckabc
 * @date 2024-07-14 15:16
 * Copyright (c) 2024 lyckabc
 * @see <a href="https://github.com/lyckabc">GitHub Repository</a>
 */
public class P181929_multiple_sum {
    public static void main(String[] args) {
        Solution sol = new Solution();
        int[] num_list = {5,7,8,3};

        System.out.println(sol.solution(num_list));

    }
}

class Solution {
    public int solution(int[] num_list) {
        int answer = 0;
        if (multiple(num_list) < sumSquare(num_list)) {
            answer = 1;
        } else {
            answer = 0;
        }
        return answer;
    }
    public int multiple(int[] num_list) {
        int sum = 1;
        for (int i = 0; i < num_list.length; i++) {
            sum *= num_list[i];
        }
        return sum;
    }
    public int sumSquare(int[] num_list) {
        int sum = 0;
        for (int i = 0; i < num_list.length; i++) {
            sum += num_list[i];
        }
        return (int)Math.pow(sum, 2);
    }
}