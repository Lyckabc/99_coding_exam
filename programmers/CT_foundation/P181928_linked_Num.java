/**
 * Class: P181928_linked_Num
 *
 * @author lyckabc
 * @date 2024-07-14 16:29
 * Copyright (c) 2024 lyckabc
 * @see <a href="https://github.com/lyckabc">GitHub Repository</a>
 */
public class P181928_linked_Num {
    public static void main(String[] args) {
        Solution sol = new Solution();
        int[] num_list = {3,4,5,2,1};

        System.out.println(sol.solution(num_list));

    }
}
class Solution {
    public int solution(int[] num_list) {
        int answer = 0;
        int evenNum = 0;
        int oddNum = 0;
        for (int i = 0; i < num_list.length; i++) {
            if (num_list[i] % 2 == 0) {
                evenNum *= 10;
                evenNum += num_list[i];
            } else {
                oddNum *= 10;
                oddNum += num_list[i];
            }
        }
        answer = evenNum + oddNum;
        return answer;
    }
}