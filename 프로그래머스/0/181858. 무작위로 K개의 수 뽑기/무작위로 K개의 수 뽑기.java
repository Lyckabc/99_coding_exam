import java.util.*;

class Solution {
    public int[] solution(int[] arr, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        Stack<Integer> st = new Stack<>();
        for (int i = 0; i < arr.length; i++) {
            int tmp = arr[i];
            if (!map.containsKey(tmp) && map.size() < k) {
                map.put(tmp, 1);
                st.push(tmp);
            }
        }
        int[] answer = new int[k];
        for (int i = k - 1; i >= 0; i--) {
            if (st.size() <= i) {
                answer[i] = -1;
            } else if(!st.isEmpty()) {
                answer[i] = st.pop();
            }
        }
        return answer;
    }
}