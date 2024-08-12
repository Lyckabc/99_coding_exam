import java.util.*;
class Solution {
    public int[] solution(int[] arr, boolean[] flag) {
        Stack<Integer> st = new Stack<>();
        for (int i = 0; i < arr.length; i++) {
            int tmp = arr[i];
            if (flag[i]) {
                for (int j = 0; j < tmp * 2; j++) {
                    st.push(tmp);
                }
            } else {
                for (int j = 0; j < tmp; j++) {
                    st.pop();
                }
            }
        }
        int lenSt = st.size();
        int[] answer = new int[lenSt];
        for (int i = lenSt - 1; i >= 0; i--) {
            answer[i] = st.pop();
        }
        return answer;
    }
}