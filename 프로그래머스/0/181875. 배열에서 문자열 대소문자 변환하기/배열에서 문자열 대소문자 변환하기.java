class Solution {
    public String[] solution(String[] strArr) {
        int lenArr = strArr.length;
        String[] answer = new String[lenArr];
        for (int i = 0; i < lenArr; i++) {
            String str = strArr[i];
            if (i % 2 == 0) {
                answer[i] = str.toLowerCase();
            } else {
                answer[i] = str.toUpperCase();
            }
        }
        return answer;
    }
}