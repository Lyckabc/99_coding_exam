class Solution {
    public String solution(String my_string, int m, int c) {
        String answer = "";
        int lenStr = my_string.length();
        int countPhrase = lenStr / m;
        String[] arr = new String[countPhrase];
        for (int i = 0; i < countPhrase; i++) {
            arr[i] = my_string.substring(i * m, (i + 1) * m);
            answer += arr[i].charAt(c - 1);
        }
        return answer;
    }
}