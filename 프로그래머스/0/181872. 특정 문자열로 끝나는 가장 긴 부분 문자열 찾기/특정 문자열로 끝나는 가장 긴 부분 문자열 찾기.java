class Solution {
    public String solution(String myString, String pat) {
        String answer = "";
        int lenStr = myString.length();
        for (int i = lenStr; i >= 0; i--) {
            if (myString.substring(i).contains(pat)) {
                answer = myString.substring(0, i + pat.length());
                break;
            }
        }
        
        return answer;
    }
}