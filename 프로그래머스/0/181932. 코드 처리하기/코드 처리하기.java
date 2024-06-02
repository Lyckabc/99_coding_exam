class Solution {
    public String solution(String code) {
        // 초기 문자열을 빈 문자열로 설정합니다.
        String answer = "";
        // 초기 모드를 0으로 설정합니다.
        int mode = 0;

        // 문자열 code의 각 문자를 순차적으로 검사합니다.
        for (int i = 0; i < code.length(); i++) {
            // 현재 문자가 '1'인 경우 모드를 변경합니다.
            if (code.charAt(i) == '1') {
                mode = 1 - mode;
            }
            // 현재 문자가 '1'이 아닌 경우
            else {
                // mode가 0일 때 idx가 짝수인 경우 문자를 추가합니다.
                // mode가 1일 때 idx가 홀수인 경우 문자를 추가합니다.
                if (i % 2 == mode) {
                    answer += code.charAt(i);
                }
            }
        }

        // 최종적으로 answer가 빈 문자열이면 "EMPTY"를 반환합니다.
        return "".equals(answer) ? "EMPTY" : answer;
    }
}