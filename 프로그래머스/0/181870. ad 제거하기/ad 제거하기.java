class Solution {
    public String[] solution(String[] strArr) {
        String notContain = "";
        for (int i = 0; i < strArr.length; i++) {
            if (!strArr[i].contains("ad")) {
                notContain += strArr[i] + " "; 
            }    
        }
        String[] answer = notContain.split(" ");
        return answer;
    }
}