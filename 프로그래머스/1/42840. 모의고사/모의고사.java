import java.util.*;
class Solution {
    public int[] solution(int[] answers) {

        int[][] patterns = {{1, 2, 3, 4, 5}, {2, 1, 2, 3, 2, 4, 2, 5}, {3, 3, 1, 1, 2, 2, 4, 4, 5, 5}};
        int[] scores = new int[3];
        for (int i = 0; i < answers.length; i++) {
            if (answers[i] == patterns[0][i % patterns[0].length]) scores[0]++;
            if (answers[i] == patterns[1][i % patterns[1].length]) scores[1]++;
            if (answers[i] == patterns[2][i % patterns[2].length]) scores[2]++;
        }
        List<Integer> answerList = new ArrayList<Integer>();
        int max = Math.max(scores[0], Math.max(scores[1], scores[2]));
        
        for(int i=0; i<3; i++){
            if(max == scores[i]) answerList.add(i+1);
        }
        return answerList.stream().mapToInt(Integer::intValue).toArray();
    }
}