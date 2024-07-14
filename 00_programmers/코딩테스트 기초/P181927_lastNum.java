/**
 * Class: P181927_lastNum
 *
 * @author lyckabc
 * @date 2024-07-14 16:40
 * Copyright (c) 2024 lyckabc
 * @see <a href="https://github.com/lyckabc">GitHub Repository</a>
 */
public class P181927_lastNum {
    public static void main(String[] args) {
        Solution sol = new Solution();
        int[] num_list = {5, 2, 1, 7, 5};

        int[] result = sol.solution(num_list);
        for (int num : result) {
            System.out.print(num + " ");
        }

    }
}

class Solution {
    public int[] solution(int[] num_list) {
        int lenNum = num_list.length;
        int[] answer = new int[lenNum +  1];
        for (int i = 0; i < lenNum; i++) {
            answer[i] = num_list[i];
        }
        int last = num_list[lenNum - 1];
        int before = num_list[lenNum - 2];

        if (last > before) {
            answer[lenNum] = last - before;
        } else {
            answer[lenNum] = last * 2;
        }
        return answer;
    }
}