import java.util.HashMap;

class Solution {
    public String solution(String my_string) {
        String answer = "";
        HashMap<Character, Integer> set = new HashMap<>();
        for (char c : my_string.toCharArray()) {
            if (!set.containsKey(c)) {
                set.put(c, 1);
                answer += c;
            }
        }
        return answer;
    }
}