class Solution {
    public String[] solution(String[] quiz) {
        int lenStr = quiz.length;
        String[] answer = new String[lenStr];
        for (int i = 0; i < lenStr; i++) {
            answer[i] = calculDecipher(quiz[i]) ? "O" : "X";
        }
        
        return answer;
    }
    public boolean calculDecipher(String quizStr) {
        String tmp = "";
        boolean answer = false;
        int total = 0;
        String[] idxStr = quizStr.split(" ");
        int oper = -1; // 0 = plus, 1 = minus, 2 = =;
        for (int i = 0; i < idxStr.length; i++) {
            tmp = idxStr[i];
            if (tmp.equals("+") || tmp.equals("-") || tmp.equals("=")){
                if (tmp.equals("+")) oper = 0;
                else if (tmp.equals("-")) oper = 1;
                else if (tmp.equals("=")) oper = 2;
            } else {
                int tmpNum = Integer.parseInt(tmp);
                if (oper <= 0) {
                    total += tmpNum;
                } else if (oper == 1) {
                    total -= tmpNum;
                } else if (oper == 2) {
                    if (total == tmpNum) return true;
                }
            } 
        }
        return answer;
    }
}