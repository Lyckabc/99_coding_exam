class Solution {
    public int solution(String myString, String pat) {
        int answer = 0;
        int lenStr = myString.length();
        for (int i = 0; i < lenStr; i++) {
            if (myString.substring(0,lenStr - i).endsWith(pat)) {
                answer++;
            }
        }
        return answer;
    }
}