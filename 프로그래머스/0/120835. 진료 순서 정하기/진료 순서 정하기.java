import java.util.Arrays;
import java.util.HashMap;
class Solution {
    public int[] solution(int[] emergency) {
        int[] answer = new int[emergency.length];
        int originEmergency[] = emergency.clone();
        Arrays.sort(emergency);
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < emergency.length; i++) {
            map.put(emergency[i], emergency.length - i);
        }
        for (int i = 0; i < originEmergency.length; i++) {
            answer[i] = map.get(originEmergency[i]);
        }
        return answer;
    }
}
