class Solution {
    public int solution(String myString, String pat) {
        int answer = 0;
        String xStr = exchangeStr(myString);
        if (xStr.contains(pat)) {
            return 1;
        }
        return answer;
    }
    public String exchangeStr(String a) {
        StringBuilder changedStr = new StringBuilder();
        for (char c : a.toCharArray()) {
            changedStr.append(c == 'A' ? 'B' : 'A');
        }
        return changedStr.toString();
    }
}