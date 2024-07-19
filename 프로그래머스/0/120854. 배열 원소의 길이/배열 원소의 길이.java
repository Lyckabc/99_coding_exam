class Solution {
    public int[] solution(String[] strlist) {
        int lenStr = strlist.length;
        int[] answer = new int[lenStr];
        for (int i = 0; i < lenStr; i++) {
            answer[i] = strlist[i].length();
        }

        return answer;
    }
}