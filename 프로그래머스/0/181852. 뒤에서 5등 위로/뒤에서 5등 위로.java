import java.util.*;
class Solution {
    public int[] solution(int[] num_list) {
        Arrays.sort(num_list);
        int lenArr = num_list.length - 5;
        if (lenArr <= 0) return new int[0];
        int[] answer = new int[lenArr];
        for (int i = 5; i < lenArr + 5; i++) {
            answer[i - 5] = num_list[i];
        }
        return answer;
    }
}