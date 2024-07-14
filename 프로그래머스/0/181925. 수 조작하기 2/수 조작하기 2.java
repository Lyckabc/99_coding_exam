class Solution {
    public String solution(int[] numLog) {
        String answer = "";
        int lenNum = numLog.length;
        for (int i = 1; i < lenNum; i++) {
            int diff = numLog[i] - numLog[i-1];
            switch (diff) {
                case 1:
                    answer += "w";
                    break;
                case -1:
                    answer += "s";
                    break;
                case 10:
                    answer += "d";
                    break;
                case -10:
                    answer += "a";
                    break;
                default:
                    break;
            }
        }
        return answer;
    }
}