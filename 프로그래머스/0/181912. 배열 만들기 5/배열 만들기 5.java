import java.util.ArrayList;
class Solution {
    public int[] solution(String[] intStrs, int k, int s, int l) {
        ArrayList<Integer> answer = new ArrayList<>();
        for (int i = 0; i < intStrs.length; i++) {
            int tmpNum = Integer.parseInt(intStrs[i].substring(s, s + l));
            if (tmpNum > k) {
                answer.add(tmpNum);
            }
        }
        return answer.stream().mapToInt(i -> i).toArray();
    }
}