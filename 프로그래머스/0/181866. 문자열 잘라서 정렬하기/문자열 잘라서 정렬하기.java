import java.util.Arrays;
class Solution {
    public String[] solution(String myString) {
        String[] strArr = myString.split("x");
        int idx = 0;
        for (String s : strArr){
            if (!s.isEmpty()) idx++;
        }
        String[] answer = new String[idx];
        idx = 0;
        for (String s : strArr) {
            if (!s.isEmpty()) answer[idx++] = s;
        }
        Arrays.sort(answer);
        return answer;
    }
   
}