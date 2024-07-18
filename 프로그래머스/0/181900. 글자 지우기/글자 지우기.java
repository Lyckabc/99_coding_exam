import java.util.Arrays;
class Solution {
    public String solution(String my_string, int[] indices) {
        String answer = "";
        int lenI = indices.length;
        Arrays.sort(indices);
        for (int i = 0, j = 0; i < my_string.length(); i++) {
            if (j >= lenI || indices[j] != i) {
                answer += my_string.charAt(i);
            } else {
                j++;
            }
        }
        return answer;
    }
}