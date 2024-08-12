import java.util.*;

class Solution {
    public int[] solution(int[] arr) {
        Stack<Integer> st = new Stack<>();
        for (int i = 0; i < arr.length; i++) {
            int tmp = arr[i];
            if (st.isEmpty()) {
                st.push(tmp);
            } else if (!st.isEmpty()) {
                if (st.peek().equals(tmp)) st.pop();
                else if (!st.peek().equals(tmp)) st.push(tmp);
            } 
        }
        if (st.isEmpty()) return new int[] {-1};
        
        int lenSt = st.size();
        int[] answer = new int[lenSt];
        for (int i = lenSt - 1; i >= 0; i--) {
            answer[i] = st.pop();
        }
        
        return answer;
    }
}