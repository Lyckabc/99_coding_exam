package P120821;
/**
 * Class: P120821_overturnArray
 *
 * @author lyckabc
 * @date 2024-07-14 23:20
 * Copyright (c) 2024 lyckabc
 * @see <a href="https://github.com/lyckabc">GitHub Repository</a>
 */
public class P120821_overturnArray {
    public static void main(String[] args) {
        Solution sol = new Solution();
        int[] num_list = {1, 2, 3, 4, 5};

        for (int num : sol.solution(num_list)) {
            System.out.print(num + " ");
        }
    }
}
class Solution {
    public int[] solution(int[] num_list) {
        int lenNum_list = num_list.length - 1;
        int[] answer = new int[lenNum_list + 1];
        for (int num : num_list) {
            answer[lenNum_list--] = num;
        }
        return answer;
    }
}