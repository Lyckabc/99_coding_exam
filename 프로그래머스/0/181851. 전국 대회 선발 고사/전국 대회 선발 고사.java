import java.util.*;
class Solution {
    public int solution(int[] rank, boolean[] attendance) {
        int answer = 0;
        HashMap<Integer,Integer> map = new HashMap<>();
        int lenArr = rank.length;
        for (int i = 0; i < lenArr; i++) {
            if (attendance[i]) map.put(rank[i], i);
        }
        lenArr = map.size();
        int[] rankArr = new int[lenArr];
        int idx = 0;
        for (int num : map.keySet()) {
            rankArr[idx++] = num;
        }
        Arrays.sort(rankArr);
        answer = map.get(rankArr[0]) * 10000 + map.get(rankArr[1]) * 100 + map.get(rankArr[2]);
        
        return answer;
    }
}