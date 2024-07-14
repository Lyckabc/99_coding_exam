class Solution {
    public int[] solution(int l, int r) {
        int lenList = 0;
        StringBuilder sb = new StringBuilder();
        for (int i = l; i <= r; i++) {

            if (chkNum(i)) {
                lenList++;
                sb.append(i);
                sb.append(" ");
            }
        }
        if (lenList == 0) return new int[] {-1};
        int[] answer = new int[lenList];
        String[] strList = sb.toString().split(" ");
        for (int i = 0; i < lenList; i++) {
            answer[i] = Integer.parseInt(strList[i]);
        }
        return answer;
    }
    public boolean chkNum(int num) {
        String strNum = String.valueOf(num);
        for (char c : strNum.toCharArray()) {
            if ((c >= '1' && c <= '4') || (c >= '6' && c <= '9')) return false;
        }
        return true;
    }
}