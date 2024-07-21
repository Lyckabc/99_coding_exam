class Solution {
    public int solution(String my_string) {
        int answer = 0;
        String[] strArr = my_string.split(" ");
        int curNum = 0;
        String operand = "";
        answer = Integer.parseInt(strArr[0]);
        for (int i = 1; i < strArr.length; i++) {
            if (strArr[i].charAt(0) >= '0' && strArr[i].charAt(0) <= '9') {
                curNum = Integer.parseInt(strArr[i]);
                switch (operand) {
                    case "+":
                        answer += curNum;
                        break;
                    case "-":
                        answer -= curNum;
                        break;
                }
            } else {
                operand = strArr[i];
            }
        }
        return answer;
    }
}