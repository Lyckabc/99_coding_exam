class Solution {
    public String solution(String my_string, int num1, int num2) {
        String answer = "";
        answer = replaceIdxStr(my_string, num1, num2);    
        return answer;
    }
    public String replaceIdxStr(String str, int idx1, int idx2) {
        char[] tmpStr = str.toCharArray();
        char tempC = tmpStr[idx1];
        tmpStr[idx1] = tmpStr[idx2];
        tmpStr[idx2] = tempC;
        return new String(tmpStr);
    }
    
}