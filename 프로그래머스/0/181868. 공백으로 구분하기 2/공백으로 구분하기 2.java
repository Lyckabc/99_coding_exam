class Solution {
    public String[] solution(String my_string) {
        
        String[] split = my_string.split(" ");
        String answer = "";
        for (int i = 0; i < split.length; i++) {
            if (!split[i].equals("")) {
                answer += split[i];
                answer += " ";
            }
        }
        return answer.split(" ");
    }
}