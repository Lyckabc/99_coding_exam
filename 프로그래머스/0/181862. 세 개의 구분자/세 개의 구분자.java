class Solution {
    public String[] solution(String myStr) {
        StringBuilder tmpAnswer = new StringBuilder();
        StringBuilder str = new StringBuilder();
        for (int i = 0; i < myStr.length(); i++) {
            char c = myStr.charAt(i);
            if (c != 'a' && c != 'b' && c != 'c') {
                str.append(c);
            } else {
                if (str.length() > 0) {
                    tmpAnswer.append(str).append(" ");
                    str.setLength(0);
                }
            }
        }
        if (str.length() > 0) {
            tmpAnswer.append(str);
        }

        String[] answer = {};
        if(tmpAnswer.toString().isEmpty()) {
            answer = new String[1];
            answer[0] = "EMPTY";
        } else {
            answer = tmpAnswer.toString().trim().split(" ");
        }
        return answer;
    }
}